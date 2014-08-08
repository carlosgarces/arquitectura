package mx.org.garces.base.ejb;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class testEJB
 */
@Stateless(mappedName = "testEJB")

public class testEJB extends BaseEJB implements testEJBLocal {

    /**
	 * 
	 */
	private static final long serialVersionUID = -2645247985144143492L;

	/**
     * Default constructor. 
     */
    public testEJB() {
        logger.debug("creando ejb");
    }

	public void echo(String s) throws Exception {
		logger.debug("sever message");
		
	}

}
