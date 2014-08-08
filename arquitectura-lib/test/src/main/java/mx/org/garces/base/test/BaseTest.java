package mx.org.garces.base.test;

import java.io.Serializable;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})

public class BaseTest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3070203815195243480L;
	public final static Logger logger = LoggerFactory.getLogger("DAO.log");
	public BaseTest() {
		// TODO Auto-generated constructor stub
	}

}
