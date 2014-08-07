package mx.org.garces.test.ejb;

import javax.ejb.Remote;

@Remote
public interface MyEJBRemote {
	
	void echo();

}
