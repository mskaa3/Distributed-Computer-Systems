package pwr.edu;

import java.io.Serializable;

public class TaskObject implements Serializable {
    String task;
    public int x1;
    public int x2;
    public double result;

    public int getx1() {
        return x1;
    }
    public int getx2() {
        return x2;
    }

    public String getTak(){
        return task;
    }
}
