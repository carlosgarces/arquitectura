package mx.org.garces.base.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import mx.org.garces.base.model.BaseModel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseDao<E extends BaseModel> implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2714130946263143968L;
	public final static Logger logger = LoggerFactory.getLogger("DAO.log");
	
	 protected EntityManager entityManager;

	/**
	 * @return the entityManager
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}
	
	@PersistenceContext
	public void setEntityManager(EntityManager entityManager){
		this.entityManager = entityManager;
	}
	
	
	public void persist(E e){
		entityManager.persist(e);
	}
	
	public void merge(E e){
		entityManager.merge(e);
	}
	
	public void remove(E e){
		entityManager.remove(e);
	}
	
	
	public void refresh(E e){
		entityManager.refresh(e);
	}
	
	public void find(Class<E> e,  Long id){
		 
		entityManager.find(e, id);
	}
	
	
	@SuppressWarnings("unchecked")
	public List<E> getRows(String namedQuery){
		Query query =  entityManager.createNamedQuery(namedQuery);
		List<E> resultado =  query.getResultList();
		return resultado;
	}
	
	@SuppressWarnings("unchecked")
	public E getRow(String namedQuery){
		Query query =  entityManager.createNamedQuery(namedQuery);
		E resultado =  (E) query.getSingleResult();
		return resultado;
	}
	
}
