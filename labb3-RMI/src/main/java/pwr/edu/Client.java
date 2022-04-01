package pwr.edu;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.sql.Array;
import java.util.Scanner;

public class Client
{
    public static void main(String[] args) throws MalformedURLException, NotBoundException, RemoteException {
        Something newPerson=new Something();
        newPerson.name="Larissa";
        newPerson.secretNumber=1234;
        Adder myAdder=(Adder) Naming.lookup("rmi://localhost:4200/adder");
        System.out.println(myAdder.add(5,7));
        System.out.println(myAdder.add(1,2));
        System.out.println(myAdder.addName(newPerson).name);
        //////////////////////////////////////////////////////////////////
        TaskObject object1=new TaskObject();

        Worker worker1=(Worker) Naming.lookup("rmi://localhost:4201/worker1");
        Worker worker2=(Worker) Naming.lookup("rmi://localhost:4202/worker2");
        System.out.println("Type two numbers :");
        Scanner sc=new Scanner(System.in);
        String[] line1=(sc.nextLine()).split(" ");


        object1.x1=Integer.parseInt(line1[0]);
        object1.x2=Integer.parseInt(line1[1]);
        System.out.println("your x1 value: "+object1.getx1());
        System.out.println("your x1 value: "+object1.getx2());
        object1.task="factorial";
        System.out.println("first result "+ worker1.calculation(object1).result);
        object1.task="modulo5";
        System.out.println("second result "+  worker2.calculation(object1).result);
        object1.task="inverse";
        System.out.println("third result "+  worker2.calculation(object1).result);









    }

}
