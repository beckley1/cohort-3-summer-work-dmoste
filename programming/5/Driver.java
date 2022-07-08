import java.io.*;
import java.util.*;


/**
 * Time class by...
 * David Moste
 * collaborators: Stacy Goldsteinn, Yeidy Levels, Usman Ahmed
 */

/**
   INSTRUCTIONS:
   This file contains the Driver starter code for our Time class.
   
   Add code in main to test all your methods
   
   Place this file in a folder named programming/5/Driver.java
*/


public class Driver {

    public static void main(String[] args) {

	    //declare a var of appropriate type to assign an instance of Time to
	    Time t;
      Time o;

	    //assign var the address of a newly-apportioned Time object
	    t = new Time();
      o = new Time();

      t.set(5, 20, 35);
      System.out.println(t.toString());

      o.set(20, 20, 32);
      t.add(o);
      System.out.println(t.toString());

      o.set(1, 40, 7);
      boolean isEqual = t.equals(o);
      System.out.println(isEqual);

      int compare = t.compareTo(o);
      System.out.println(compare);
    }//end main()

}//end class