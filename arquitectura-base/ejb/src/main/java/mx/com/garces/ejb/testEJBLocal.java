package mx.com.garces.ejb;

import javax.ejb.Remote;

@Remote
public interface testEJBLocal {

	void echo(String s) throws Exception;
	
}
