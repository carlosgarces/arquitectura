package mx.org.garces.test.ejb;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;

import mx.org.garces.base.ejb.BaseTransactionEJB;
import mx.org.garces.base.service.TestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ejb.interceptor.SpringBeanAutowiringInterceptor;

/**
 * Session Bean implementation class MyEJB
 */
@Stateless(mappedName = "ejb/myEJB")
@Remote(MyEJBRemote.class)
//@JNDIName("ejb/myEJB#mx.org.garces.test.ejb.MyEJBRemote")
@Interceptors(SpringBeanAutowiringInterceptor.class)
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
