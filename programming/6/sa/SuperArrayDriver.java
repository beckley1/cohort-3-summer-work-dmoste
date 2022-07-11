import java.io.*;
import java.util.*;

public class SuperArrayDriver
{
  public static void main( String[] args )
  {
    System.out.println("Testing default constructor.");
    SuperArray sa = new SuperArray();
    System.out.println("Testing empty print:");
    System.out.println(sa);
    System.out.println("Testing isEmpty (should be true)");
    System.out.println(sa.isEmpty());
    // -----------------------------------------------------------
    // YOUR HOMEGROWN/HOUSEMADE/ROLL-YOUR-OWN TEST METHODS HERE...
    // -----------------------------------------------------------
    //precondition: newly-instantiated SuperArray of default capacity
    System.out.println("Testing overfill (calling grow() in add)");
    for (int i=0; i<15; i++) {
      sa.add(i);
    }//for i
    System.out.println(sa);
    System.out.println(sa.isEmpty());
    
    System.out.println("\nTesting add at index 5, 0 and 17(end)");
    sa.add(5, 100);
    
    System.out.println("The value at index 5 is " + sa.get(5));
    
    System.out.println(sa);
    sa.add(0, 100);
    System.out.println(sa);
    sa.add(17, 100);
    System.out.println(sa);

    System.out.println("\nTesting adding at index 2000");
    sa.add(2000, 5);
    
    System.out.println("\nTesting remove at 0, 5, and 15 (end)");
    sa.remove(0);
    System.out.println(sa);
    sa.remove(5);
    System.out.println(sa);
    sa.remove(15);
    System.out.println(sa);
    
    System.out.println("\nTesting removing at index 50");
    sa.remove(50);

    System.out.println("\nTesting overload constructor.");
    SuperArray osa = new SuperArray(5);
    System.out.println("Testing empty print:");
    System.out.println(osa);
    System.out.println("Testing isEmpty (should be true)");
    System.out.println(osa.isEmpty());
    // -----------------------------------------------------------
    // YOUR HOMEGROWN/HOUSEMADE/ROLL-YOUR-OWN TEST METHODS HERE...
    // -----------------------------------------------------------
    //precondition: newly-instantiated SuperArray of default capacity
    System.out.println("Testing overfill (calling grow() in add)");
    for (int i=0; i<15; i++) {
      osa.add(i);
    }//for i
    System.out.println(osa);
    System.out.println(osa.isEmpty());
    
    System.out.println("\nTesting add at index 5, 0 and 17(end)");
    osa.add(5, 100);
    
    System.out.println("The value at index 5 is " + osa.get(5));
    
    System.out.println(osa);
    osa.add(0, 100);
    System.out.println(osa);
    osa.add(17, 100);
    System.out.println(osa);

    System.out.println("\nTesting adding at index 2000");
    osa.add(2000, 5);
    
    System.out.println("\nTesting remove at 0, 5, and 15 (end)");
    osa.remove(0);
    System.out.println(osa);
    osa.remove(5);
    System.out.println(osa);
    osa.remove(15);
    System.out.println(osa);
    
    System.out.println("\nTesting removing at index 50");
    osa.remove(50);

  }//main

}//class SuperArrayDriver