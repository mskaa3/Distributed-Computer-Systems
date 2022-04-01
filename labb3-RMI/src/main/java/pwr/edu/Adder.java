package pwr.edu;

import java.rmi.Remote;
import java.rmi.RemoteException;



public interface Adder extends Remote
{
    int add(int x, int y ) throws RemoteException;
    Something addName(Something sth) throws  RemoteException;
}
