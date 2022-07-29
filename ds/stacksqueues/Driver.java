import java.io.*;
import java.util.*;

public class Driver{

  public static void main(String[] args) {

	  Stack s = new Stack();
    
    System.out.println("Stack Empty: " + s.isEmpty());
    System.out.println(s);
    System.out.println("Popped Stack: " + s.pop());
    System.out.println("Pushing 5 to Stack");
    s.push(5);
    System.out.println("Pushing 10 to Stack");
    s.push(10);
    System.out.println("Pushing 12 to Stack");
    s.push(12);
    System.out.println("Stack Empty: " + s.isEmpty());
    System.out.println(s);
    System.out.println("Popped Stack: " + s.pop());
    System.out.println("Top of Stack: " + s.top());
    System.out.println(s);
    System.out.println("Current Stack Size: " + s.size());
    System.out.println("Stack Full: " + s.isFull());
    System.out.println("Pushing 2 to Stack");
    s.push(2);
    System.out.println("Pushing 124 to Stack");
    s.push(124);
    System.out.println(s);

	  Queue q = new Queue();
    System.out.println("Queue Empty: " + q.isEmpty());
    System.out.println(q);
    System.out.println("Dequeued: " + q.dequeue());
    System.out.println("Queueing 5");
    q.enqueue(5);
    System.out.println("Queueing 10");
    q.enqueue(10);
    System.out.println("Queueing 12");
    q.enqueue(12);
    System.out.println("Queue Empty: " + q.isEmpty());
    System.out.println(q);
    System.out.println("Dequeued: " + q.dequeue());
    System.out.println("Front of Queue: " + q.front());
    System.out.println(q);
    System.out.println("Current Queue Length: " + q.size());
    System.out.println("Queue Full: " + q.isFull());
    System.out.println("Queueing 2");
    q.enqueue(2);
    System.out.println("Queueing 124");
    q.enqueue(124);
    System.out.println(q);
	
    }
}