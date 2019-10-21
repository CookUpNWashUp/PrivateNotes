package RMItarget.target;

import java.rmi.Remote;
import java.rmi.RemoteException;
public interface RemoteHello extends Remote {
	public abstract String sayHello() throws RemoteException;
}
