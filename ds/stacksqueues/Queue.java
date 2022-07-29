/*
Due to the FIFO nature of queues, I decided that using linked lists made more sense than array lists.
Since ques need to add to one end and remove from the other end, using a linked list gets around the need to shift all the items whenever an item is added/removed.
*/

import java.io.*;
import java.util.*;

public class Queue{

  // Place private instance variables here
  private LinkedList data;
  private int queueLength;

  // Place constructors here - A constructor with no parameters
  public Queue(){
    data = new LinkedList();
    queueLength = 0;
  }

  // Place methods here

  // void enqueue(int value) - add value to the end of the queue
  public void enqueue(int value){
    data.add(value);
    queueLength ++;
  }

  // int dequeue() - remove and return the top value from front of the queue
  public int dequeue(){
    int value = -1;
    
    if(queueLength > 0){
      value = data.get(queueLength-1);
      data.remove(queueLength-1);
      queueLength --; 
    }
    
    return value;
  }

  // int front() - return but do not remove the top value from the front of the queue
  public int front(){
    int value = -1;

    if(queueLength > 0){
      value = data.get(queueLength-1);
    }
    return value;
  }

  // boolean isEmpty() - return true of the queue is empty, false otherwise
  public boolean isEmpty(){
    if(queueLength < 1){
      return true;
    }

    return false;
  }

  // int size() - return the number of elements currently in the queue
  public int size(){
    return queueLength;
  }

  // boolean isFull() - returns true if the queue is full, false otherwise - only implement this if you use an array for implementation
  public boolean isFull(){
    return false;
  }

  public String toString(){
    if(queueLength == 0){
      return "\n---Current State of Queue---\nnull\n";
    }
    
    return "\n---Current State of Queue---\n" + data + "\n";
  }
    

}