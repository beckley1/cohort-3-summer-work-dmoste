import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    l.add("Hello");
    l.add("World");

    System.out.println(l.get(4));
    System.out.println(l.indexOf("Happy"));
    System.out.println("Size: " + l.size());
    
    System.out.println(l);
  }
}