import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by mx on 23.11.17.
 */
public interface Hello_RMI_IF extends Remote {
    public String sayHello() throws RemoteException;
}
