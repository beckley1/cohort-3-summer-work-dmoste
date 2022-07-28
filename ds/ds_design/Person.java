import java.io.*;
import java.util.*;

public class Person {
  private String lastName;
  private String firstName;
  private String phoneNumber;

  public Person(String ln, String fn, String pn){
    lastName = ln;
    firstName = fn;
    phoneNumber = pn;
  }

  public String getLast(){
    return lastName;
  }

  public String toString(){
    return lastName;
  }
}