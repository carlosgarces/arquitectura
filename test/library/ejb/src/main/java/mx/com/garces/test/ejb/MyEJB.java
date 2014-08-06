package mx.com.garces.test.ejb;

import javax.ejb.Stateless;

import mx.com.garces.base.ejb.BaseTransactionEJB;

/**
 * Session Bean implementation class MyEJB
 */
@Stateless(mappedName = "myEJB")
public class MyEJB extends BaseTransactionEJB implements MyEJBRemote {

    /**
	 * 
	 */
	private static final long serialVersionUID = 2504759446582167812L;

	/**
     * Default constructor. 
     */
    public MyEJB() {
        // TODO Auto-generated constructor stub
    }

	public void echo() {
		// TODO Auto-generated method stub
		
	}

}
