import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    l.add("Hello");
    l.add("World");

    System.out.println(l.get(0));
    System.out.println(l.size());
    
    System.out.println(l);
  }
}