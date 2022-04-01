package pwr.edu;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Worker extends Remote {
    public TaskObject calculation(TaskObject obj) throws RemoteException;
}
