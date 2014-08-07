package mx.org.garces.base.ejb;

import java.io.Serializable;
import java.util.logging.Logger;

import javax.ejb.CreateException;
import javax.interceptor.Interceptors;

import org.springframework.ejb.interceptor.SpringBeanAutowiringInterceptor;
import org.springframework.ejb.support.AbstractStatelessSessionBean;


@Interceptors(SpringBeanAutowiringInterceptor.class)
public class BaseEJB  implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 4082138409364487719L;

	public final static Logger logger = Logger.getLogger("EJB.log");
	
	public BaseEJB() {
		
	}

		
}
