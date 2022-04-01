package pwr.edu;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AdderImplementation extends UnicastRemoteObject implements  Adder {

    int acc=0;
    protected AdderImplementation() throws RemoteException {
        super();
    }

    @Override
    public int add(int x, int y) throws RemoteException {
        acc=acc+x;
        return acc+x+y;
    }

    @Override
    public Something addName(Something sth) throws RemoteException {
        sth.name="Ms "+ sth.name;
        System.out.println(" Your secret number: "+ sth.secretNumber);
        return sth;
    }
}
