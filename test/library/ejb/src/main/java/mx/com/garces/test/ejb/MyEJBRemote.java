package mx.com.garces.test.ejb;

import javax.ejb.Remote;

@Remote
public interface MyEJBRemote {
	
	void echo();

}
