package RMItarget.target;

import java.rmi.RemoteException;

public class RemoteHelloImpl implements RemoteHello {

	public String sayHello() throws RemoteException {
		return "Hello, world";
	}

}
