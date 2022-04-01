package pwr.edu;

import java.io.Serializable;

public class Something implements Serializable {
    String name;
    transient int secretNumber;
}
