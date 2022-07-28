import java.io.*;
import java.util.*;

public class Driver{

  public static void main(String[] args) {

	  Stack s = new Stack();
    
    System.out.println("Stack Empty: " + s.isEmpty());
    System.out.println(s);
    System.out.println("Adding 5 to Stack");
    s.push(5);
    System.out.println("Adding 10 to Stack");
    s.push(10);
    System.out.println("Adding 12 to Stack");
    s.push(12);
    System.out.println("Stack Empty: " + s.isEmpty());
    System.out.println(s);
    System.out.println("Popped Stack: " + s.pop());
    System.out.println("Top of Stack: " + s.top());
    System.out.println(s);
    System.out.println("Current Stack Size: " + s.size());
    System.out.println("Stack Full? " + s.isFull());
    System.out.println("Adding 2 to Stack");
    s.push(2);
    System.out.println("Adding 124 to Stack");
    s.push(124);
    System.out.println(s);

	  //Queue q = new Queue();
	
    }
}