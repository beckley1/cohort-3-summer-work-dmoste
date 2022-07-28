import java.io.*;
import java.util.*;

public class Driver{

  public static void main(String[] args) {

	  Stack s = new Stack();
    
    System.out.println("Stack Empty: " + s.isEmpty());
    s.push(5);
    s.push(10);
    s.push(12);
    System.out.println("Stack Empty: " + s.isEmpty());
    System.out.println("\n---Current State of Stack---");
    System.out.println(s + "\n");
    System.out.println("Popped Stack: " + s.pop());
    System.out.println("Top of Stack: " + s.top());
    System.out.println("\n---Current State of Stack---");
    System.out.println(s + "\n");
    System.out.println("Current Stack Size: " + s.size());
    System.out.println("Stack Full? " + s.isFull());
    s.push(2);
    s.push(124);
    System.out.println("\n---Current State of Stack---");
    System.out.println(s + "\n");

	  //Queue q = new Queue();
	
    }
}