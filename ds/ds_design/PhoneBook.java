import java.io.*;
import java.util.*;

public class PhoneBook{

  private ArrayList<String> data = new ArrayList<String>();
  private int entries = 3;

  public PhoneBook(){
    Person one = new Person("Moste", "David", "7403236305");
    Person two = new Person("Newton", "Isaac", "0123456789");
    Person three = new Person("Einstein", "Albert", "9876543210");

    data.add(one.getLast());
    data.add(two.getLast());
    data.add(three.getLast());
  }
  
  public void add(Person p){
    
  }

  public Person find(String lastName){
    Person four = new Person("", "", "");

    return four;
  }

  public void remove(String lastName){
    
  }

  public void printList(){
    for(int i = 0; i < entries; i++){
      System.out.println(data.get(i));
    }
  }
}