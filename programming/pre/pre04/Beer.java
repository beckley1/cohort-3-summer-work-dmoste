import java.io.*;
import java.util.*;

public class Beer{
	public static void main(String[] args) {
    int bottles = 99;

    drink(bottles);
	}

  public static void drink(int bottles){
    System.out.printf("%d bottles of beer on the wall,\n", bottles);
    System.out.printf("%d bottles of beer,\n", bottles);
    System.out.println("ya' take one down, ya' pass it around,");
    System.out.printf("%d bottles of beer on the wall\n", bottles - 1);

    if(bottles > 1){
      drink(bottles - 1);
    } else {
      System.out.println("No bottles of beer on the wall,");
      System.out.println("no bottles of beer,");
      System.out.println("ya’ can’t take one down, ya’ can’t pass it around,");
      System.out.println("’cause there are no more bottles of beer on the wall!");
    }
  }
}