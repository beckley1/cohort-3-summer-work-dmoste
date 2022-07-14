import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    l.add("World");
    l.add("Hello");

    System.out.println(l.get(1));
    System.out.println(l.indexOf("Hello"));
    System.out.println("Size: " + l.size());
    
    System.out.println(l);
  }
}