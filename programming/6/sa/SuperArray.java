/**
 * SuperArray by...
 * David Moste
 * collaborators: Adam Driggers, Elizabeth Rechtin
 */

/**
   SKELETON
   SuperArray is a wrapper class for an array.
   Provides "pass-thru" accessibility to pre-existing array capabilities:
   - get/set by index
   - get length
   Adds functionality:
   - dynamic capacity
   - auto-grow capacity if necessary
*/

import java.io.*;
import java.util.*;

public class SuperArray
{
  /**
     SUBGOAL:
     declare instance vars
     ...and initialize?
  */


  //instance vars
  private int[] data;           // "interior"/"underlying" data container
  private int numberElements;   // number of "meaningful" elements


  // ~~~~~~~~~~~~~~~ CONSTRUCTORS ~~~~~~~~~~~~~~~
  //overloaded constructor -- allows specification of initial capacity
  public SuperArray( int size )
  {
    //init underlying/inner storage of specified capacity
    data = new int[size];

    //init instance vars
    numberElements = 0;

  }

  //default constructor -- initializes capacity to 10
  public SuperArray()
  {
    //init underlying/inner storage of capacity 10
    data = new int[10];

    //init instance vars
    numberElements = 0;
  }


  // ~~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~
  public void add( int value )
  {
    // test to see if we need to grow, then grow
    if(data.length == numberElements){
      grow();
    }

    // add item
   data[numberElements] = value;


    // increment numberElements
    numberElements++;

  }//end add()


  public boolean isEmpty()
  {
    //return whether this SuperArray instance is empty
    return numberElements == 0;
  }


  public int get(int index)
  {
    //check if index exists and return the value if it does
    if(index < numberElements){
      return data[index];
    }
    
    return -1;
  }


  public String toString()
  {
    //create placeholder string and add an opening bracket
    String printString = new String("[");

    //loop through all remaining elements
    for(int i = 0; i < numberElements; i++){
      if(i < numberElements - 1){
        printString += data[i] + ", ";
      }else{
        printString += data[i];
      }
    }

    //close the brackets
    printString += "]";

    return printString;
  }//end toString()


  //return Stringified version of this Object,
  // with extra debugging info
  //(helper method for debugging/development phase)
  public String debug()
  {
    String s = "";
    s = "Size: " + this.data.length;
    s = s + " LastItem: " + numberElements + "  Data: ";
    for (int i = 0; i < numberElements; i++) {
      s = s + data[i] + ", ";
    }
    s = s + "\n";
    return s;
  }//end debug()


  public void remove(int index)
  {
    //loop through all elements above the index value
    for(int i = index; i < numberElements-1; i++){
      //slide elements left
      data[i] = data[i+1];
    }

    //reduce number of elements
    numberElements--;
  }


  public void add(int index, int value)
  {
    //check if the index is reasonable
    if(index < numberElements + 5){
      // see if there's enough room
      if(data.length == numberElements){
        grow();
      }
  
      // shift elements toward the end of the array
      for(int i = 0; i < numberElements-index; i++){
        data[numberElements-i] = data[numberElements-i-1];
      }
  
      // insert new element
      data[index] = value;
  
      // increment numElements
      numberElements++;
    }else{
      System.out.printf("You're trying to add a value at index %d. This is unreasonable.\n", index);
    }
  }


  private void grow()
  {
    // create a new array with extra space
    // Q: How did you decide how much to increase capacity by?
    int[] temp = new int[data.length + 5];

    // copy over all the elements from the old array to the new one
    for(int i = 0; i < data.length; i++){
      temp[i] = data[i];
    }

    // point data to the new array
    // Q: How does this look when illustrated using encapsulation diagram?
    data = temp;
  }//end grow()

}//end class