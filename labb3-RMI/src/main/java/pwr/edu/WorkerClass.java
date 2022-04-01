package pwr.edu;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class WorkerClass extends UnicastRemoteObject implements Worker{
    protected WorkerClass() throws RemoteException {
        super();
    }

    @Override
    public TaskObject calculation(TaskObject obj) throws RemoteException {
        if ((obj.getTak()).equalsIgnoreCase("factorial")){
            int i,fact=1;
            int number=obj.getx1();
            for(i=1;i<=number;i++){
                fact=fact*i;
            }
            obj.result=fact;
            return obj;

        }else if((obj.getTak()).equalsIgnoreCase("modulo10")){
              obj.result=(obj.getx1())%10;
            return obj;
        } else if((obj.getTak()).equalsIgnoreCase("modulo5")) {
            obj.result = (obj.getx2()) %5;
            return obj;
        }else if ((obj.getTak()).equalsIgnoreCase("inverse")){
            obj.result=1.0/obj.getx1();
            return obj;
        }else {
            System.out.println("Whoops, there is no such operation");
            return obj;
        }

    }
}
