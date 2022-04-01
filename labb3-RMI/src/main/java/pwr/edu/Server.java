package pwr.edu;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Logger;

public class Server {
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        LocateRegistry.createRegistry(4200);
        LocateRegistry.createRegistry(4201);
        LocateRegistry.createRegistry(4202);
        Adder adder=new AdderImplementation();
        Worker worker=new WorkerClass();
        Naming.rebind("rmi://localhost:4200/adder",adder);
        Naming.rebind("rmi://localhost:4201/worker1",worker);
        Naming.rebind("rmi://localhost:4202/worker2",worker);
        System.out.println();


    }
}
