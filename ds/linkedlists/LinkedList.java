import java.io.*;
import java.util.*;

/**
  For all attempted methods, make sensible decisions for error and
  edge cases (such as indexing out of bounds).
  Basic
  -----
  add(string value)
  get(int index);
  indexOf(String value);
  Intermediate (at least add, size + one of the other two)
  ------------
  add(int index,String value)
  size()
  toString()
  toArray()
  Challenge
  --------
  remove(int index);
*/

public class LinkedList{

  private Node head;

  public LinkedList(){
    head = null;
  }

  /**
  Parameters:
  value - the new string to add to the list
  Adds a new node containing value to the front of the list.
  */
  public void add(String value){
    Node n = new Node(value, head);
    head = n;
  }

  /**
  Returns the String in the node at location index.
  */
  public String get(int index){
    if(index >= 0){
      if(head == null){
        return "This Linked List is empty";
      }else{
        Node currentNode = head;
      
        for(int i = 0; i < index; i++){
          if(currentNode != null){
            currentNode = currentNode.getNext();
          }else{
            return "Index out of bounds";
          }
        }
        return currentNode.getData();
      }
    }else{
      return "Indices must be positive";
    }
  }

  /**
  returns the number of elements in the lsit
  */
  public int size(){
    int counter = 0;

    for(Node n = head; n != null; n = n.getNext()){
      counter++;
    }

  	return counter;
  }


  /**
  Returns the index (location) of the first node in the list
  that contains value.
  Example:
  Given the list:
  "a"->"b"->"c"->"d"->"e"
  indexOf("d") would return 3 since "d" is at location 3.
  */
  public int indexOf(String value){
    int counter = 0;

    for(Node n = head; n != null; n = n.getNext()){
      if(n.getData() == value){
        return counter;
      }else{
        counter++;
      }
    }
	
    return -1;
  }



  /**
  Return a string representation of the list
  */
  public String toString(){
    Node currentNode = head;
    String asString = "[";

    for(Node n = head; n != null; n = n.getNext()){
      if(n.getNext() != null){
        asString += n.getData() + ", ";
      }else{
        asString += n.getData() + "]";
      }
    }
    
	return asString;
  }




  /**
  Parameters:
  index - an int with the location to add
  value - the new value
  Adds a new node with the String value to the list.
  The new node should be added at the location specified by the index.
  For example, given the list:
  "a" -> "b" -> "c" -> "d"
  add(1,"z") results in:
  "a"-> "z" -> "b" -> "c" -> "d"
  */
  public void add(int index, String value){

  }



  /**
  This routine should create a new array that is the same
  size as the number of Nodes in the list.
  It should then copy all of the values to the array and return
  the array.
  */
  public String[] toArray(){
    return null;
  }



  /**
  Remove the Node at location index from the list.
  Ex:
  Given the list:
  "a"->"b"->"c"->"d"->"e"
  remove(2) results in:
  "a"->"b"->"d"->"e"
  */
  public void remove(int index){
  }
}