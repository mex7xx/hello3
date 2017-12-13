import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.*;
import java.net.*;

/**
 * Created by mx on 23.11.17.
 */


import java.rmi.*;
import java.rmi.server.*;
import java.net.*;

public class Hello_RMI_Server {

    // Definition Default-Konstruktor, da Basisklasse RemoteException throws
//    public Hello_RMI_Server() throws RemoteException {
//      super(); }
    // Definition der Methode, die vom Client aufgerufen wird
    // public String sayHello() throws RemoteException {
    //    return ("Hello world!");
    //}


    public static void main(String args[]) {
        try {
            Hello_Impl obj = new Hello_Impl();
            String objName = "HelloObj1";

            Hello_RMI_IF stub = (Hello_RMI_IF) UnicastRemoteObject.exportObject(obj,0);

            Registry registry  = LocateRegistry.getRegistry();
            registry.rebind(objName, stub);


            //LocateRegistry.createRegistry(1099);
            // Server-Instanz erzeugen
            //Hello_RMI_Server hello_server = new Hello_RMI_Server();             // make new Server
            // Server-Objekt für entfernten Aufruf in der RMI-Registry bekannt geben
            //Naming.rebind("//localhost/Hello_RMI_Server", hello_server);



            // Server als verfügbar melden
            System.out.println("Hello.RMI.Server ready");
        }
        // rebind() throws RemoteException, MalformedURLException
        catch (Exception e) {
            System.out.println("Exception in Hello_RMI_Server.Main: " + e);
        }
    }

}
