package RMItarget.target;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import org.apache.commons.collections.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
        	LocateRegistry.createRegistry(1099);
        	Naming.bind("Test", new RemoteHelloImpl());
        	System.out.println("Test RMI server is ready");
        }catch (Exception e) {
        	e.printStackTrace();
        }
    }
}
