
public class Queue{

  // Place private instance variables here
  LinkedList data;

  // Place constructors here - A constructor with no parameters
  public Queue(){
    data = new LinkedList();
  }

  // Place methods here

  // void enqueue(int value) - add value to the end of the queue
  public void enqueue(int value){
    data.add(value);
  }

  // int dequeue() - remove and return the top value from front of the queue
  public int dequeue(){
    int value = data.get(data.size()-1);
    data.remove(data.size()-1);
    
    return value;
  }

  // int front() - return but do not remove the top value from the front of the queue
  public int front(){
    return data.get(data.size()-1);
  }

  // boolean isEmpty() - return true of the queue is empty, false otherwise
  public boolean isEmpty(){
    if(data.size() < 1){
      return true;
    }

    return false;
  }

  // int size() - return the number of elements currently in the queue
  public int size(){
    return data.size();
  }

  // boolean isFull() - returns true if the queue is full, false otherwise - only implement this if you use an array for implementation
  public boolean isFull(){
    return false;
  }

  public String toString(){
    return data.toString();
  }
    

}