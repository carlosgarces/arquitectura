package mx.org.garces.test.ejb;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;

import mx.org.garces.base.test.BaseTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class Testejb extends BaseTest {

	@Autowired
	MyEJBRemote myEjbMock;

	MyEJBRemote remoteObject;

	@Before
	public void setUp() throws Exception {
		Properties props = new Properties();
		props.setProperty(Context.INITIAL_CONTEXT_FACTORY,
				"weblogic.jndi.WLInitialContextFactory");
		props.setProperty(Context.PROVIDER_URL, "t3://localhost:7001");
		props.setProperty(Context.SECURITY_PRINCIPAL,"weblogic");
		props.setProperty(Context.SECURITY_CREDENTIALS,"Qwerty123");

		InitialContext ctx = new InitialContext(props);

		try {
			remoteObject = (MyEJBRemote) ctx
					.lookup("ejb/myEJB#mx.org.garces.test.ejb.MyEJBRemote");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("fallo");
		}

		// if (myEjbMock == null) {
		// myEjbMock = new MyEJB();
		// }

	}

	@Test
	public void testEcho() {

		myEjbMock.echo();
		try {
			remoteObject.echo();
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("fallo");
		}
		
	}
}
