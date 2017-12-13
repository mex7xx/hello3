/**
 * Created by mx on 23.11.17.
 */

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Hello_RMI_Client {
    public static void main(String args[]) {
        try {
            // Zugriffsreferenz auf Server via Naming-Dienst ermitteln
            //Hello_RMI_IF hs = (Hello_RMI_IF)Naming.lookup("rmi://localhost/Hello_RMI_Server");

            //String result = hs.sayHello();
            //System.out.println("Hello_RMI_Client: Ergebnis ist: " + result);


            Registry registry = LocateRegistry.getRegistry();
            Hello_RMI_IF stub = (Hello_RMI_IF) registry.lookup("HelloObj1");

            System.out.println("Server says: " + stub.sayHello());

        }
            // lookup() throws NotBoundException, RemoteException, MalformedURLException
            catch (Exception e) {
                System.out.println("Exception in Hello_RMI_Client.Main: " + e);
            }
    }
}