import java.io.*;
import java.util.*;

public class SortSearchDriver {
    public static void main(String[] args) {


    	// Uncomment these to test part 1
    	
    	SortSearch ss = new SortSearch(20);
    	System.out.println(ss);
    	
    		
    	// Uncomment these to test part 2
    
    	int i;
    	i = ss.findSmallestIndex(0);
    	System.out.println("ss["+ i +"] = "+ss.get(i)+" : " + ss);
    
    	i = ss.findSmallestIndex(3);
    	System.out.println("ss["+ i + "] = "+ss.get(i)+" : " + ss);
    	
    	// Uncomment these to test part 3
    
    	System.out.println("Original: " + ss);
    	ss.sort();
    	System.out.println("Sorted: " + ss);

      System.out.println("(Linear) Index of -2: " + ss.linearSearch(-2));
      System.out.println("(Linear) Index of 4: " + ss.linearSearch(4));
      System.out.println("(Linear) Index of 20: " + ss.linearSearch(20));
      
      System.out.println("Index of -2: " + ss.binarySearch(-2));
      System.out.println("Index of 4: " + ss.binarySearch(4));
      System.out.println("Index of 20: " + ss.binarySearch(20));

      System.out.println("(Recursive) Index of -2: " + ss.binarySearchRecursive(-2, 0, 19));
      System.out.println("(Recursive) Index of 4: " + ss.binarySearchRecursive(4, 0, 19));
      System.out.println("(Recursive) Index of 20: " + ss.binarySearchRecursive(20, 0, 19));
    }
}