import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by mx on 13.12.17.
 */
public class Hello_Impl implements Hello_RMI_IF {
    
    @Override
    public String sayHello() throws RemoteException {
        return ("Hello world!");
    }
}
