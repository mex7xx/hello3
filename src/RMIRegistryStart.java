import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import static java.lang.Thread.sleep;

public class RMIRegistryStart {

    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            sleep(1_000_000_000);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
