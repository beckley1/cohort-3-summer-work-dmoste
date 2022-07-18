import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    System.out.println("Size: " + l.size());
    
    l.add("Six");
    l.add("Five");
    l.add("Four");

    System.out.println("The value at index 2 is: " + l.get(2));
    System.out.println("The index of Four is: " + l.indexOf("Four"));
    System.out.println("Size: " + l.size());
    
    System.out.println(l);

    l.add(0, "Zero");
    System.out.println(l);

    l.add(1, "One");
    System.out.println(l);

    l.add(2, "Two");
    System.out.println(l);

    l.add(3, "Three");
    System.out.println(l);

    l.add(7, "Seven");
    System.out.println(l);

    System.out.println(Arrays.toString(l.toArray()));
  }
}