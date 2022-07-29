import java.io.*;
import java.util.*;

public class LinkedList{

  private Node head;

  public LinkedList(){
    head = null;
  }

  public void add(int value){
    head = new Node(value, head);
  }

  public void add(int index, int value){
    Node walker = head;
    Node n = new Node(value);

    if(index == 0){
      add(value);
    }else{
      for(int i = 0; i < index-1; i++){
        walker = walker.getNext();
      }
      n.setNext(walker.getNext());
      walker.setNext(n);
    }
  }

  public int get(int index){
    if(index >= 0){
      Node walker = head;
      
      for(int i = 0; i < index; i++){
        if(walker != null){
          walker = walker.getNext();
        }else{
          return -1;
        }
      }
      
      return walker.getData();
    }else{
      return -1;
    }
  }

  public int size(){
    Node walker = head;
    int counter = 0;

    while(walker != null){
      counter++;
      walker = walker.getNext();
    }

  	return counter;
  }


  public int indexOf(int value){
    Node walker = head;
    int counter = 0;

    while(walker != null){
      if(walker.getData() == value){
        return counter;
      }else{
        counter++;
        walker = walker.getNext();
      }
    }
	
    return -1;
  }

  public String toString(){
    Node walker = head;
    String temp = "";

    while(walker != null){
      temp += walker.getData() + "->";
      walker = walker.getNext();
    }

    temp += "null";
    
	return temp;
  }

  public int[] toArray(){
    Node walker = head;
    int counter = size();

    int[] data = new int[counter];

    for(int i = 0; i < counter; i++){
      data[i] = walker.getData();
      walker = walker.getNext();
    }
    
    return data;
  }

  public void remove(int index){
    Node walker = head;

    if(index == 0){
      head = head.getNext();
    }else{
      for(int i = 0; i < index-1; i++){
        walker = walker.getNext();
      }

      walker.setNext(walker.getNext().getNext());
    }
  }
}