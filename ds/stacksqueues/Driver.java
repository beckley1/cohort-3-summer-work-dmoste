import java.io.*;
import java.util.*;

public class Driver{

  public static void main(String[] args) {

	  Stack s = new Stack();
    s.push(5);
    s.push(10);
    s.push(12);
    System.out.println("Stack Empty: " + s.isEmpty());
    System.out.println("Current state of stack:");
    System.out.println(s);
    System.out.println("Popped stack: " + s.pop());
    System.out.println("Top of stack: " + s.top());
    System.out.println("Current state of stack:");
    System.out.println(s);
    System.out.println("Current Stack Size: " + s.size());
    System.out.println("Stack Full? " + s.isFull());
    s.push(2);
    s.push(124);
    System.out.println("Current state of stack:");
    System.out.println(s);

	  //Queue q = new Queue();
	
    }
}