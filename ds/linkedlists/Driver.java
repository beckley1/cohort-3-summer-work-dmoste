import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    l.add("Dude");
    l.add("World");
    l.add("Hello");

    System.out.println("The value at index 4 is: " + l.get(4));
    System.out.println("The index of Hello is: " + l.indexOf("Hello"));
    System.out.println("Size: " + l.size());
    
    System.out.println(l);
  }
}