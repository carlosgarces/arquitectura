package mx.org.garces.test.ejb;

import javax.ejb.Stateless;

import mx.org.garces.base.ejb.BaseTransactionEJB;
import mx.org.garces.base.service.TestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Session Bean implementation class MyEJB
 */
@Stateless(mappedName = "myEJB")
public class MyEJB extends BaseTransactionEJB implements MyEJBRemote {

	
	@Autowired
	@Qualifier("testService")
	TestService testService;
    /**
	 * 
	 */
	private static final long serialVersionUID = 2504759446582167812L;

	/**
     * Default constructor. 
     */
    public MyEJB() {
        
    }

	public void echo() {
		testService.echo();
		
	}

}
