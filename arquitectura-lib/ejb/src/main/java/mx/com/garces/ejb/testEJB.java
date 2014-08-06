package mx.com.garces.ejb;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class testEJB
 */
@Stateless(mappedName = "testEJB")
public class testEJB implements testEJBLocal {

    /**
     * Default constructor. 
     */
    public testEJB() {
        // TODO Auto-generated constructor stub
    }

	public void echo(String s) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
