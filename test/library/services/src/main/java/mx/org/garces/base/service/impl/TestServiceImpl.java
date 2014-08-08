package mx.org.garces.base.service.impl;

import org.springframework.stereotype.Service;

import mx.org.garces.base.service.BaseService;
import mx.org.garces.base.service.TestService;


@Service("testService")
public class TestServiceImpl extends BaseService  implements TestService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7845312250818999348L;

	public void echo() {
		logger.info("echo");
		
	}

}
