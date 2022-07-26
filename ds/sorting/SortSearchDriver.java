import java.io.*;
import java.util.*;

public class SortSearchDriver {
  public static void main(String[] args) {


    // Uncomment these to test part 1

    int size = 20;
    long start;
    long end;
    
    SortSearch ss = new SortSearch(size);
    //System.out.println(ss);
    
      
    // Uncomment these to test part 2
  
    int i;
    i = ss.findSmallestIndex(0);
    System.out.println("ss["+ i +"] = "+ss.get(i)+" : " + ss);
  
    i = ss.findSmallestIndex(3);
    System.out.println("ss["+ i + "] = "+ss.get(i)+" : " + ss);
    
    // Uncomment these to test part 3
  
    System.out.println("Original: " + ss);
    //start = System.currentTimeMillis();
    ss.sort();
    //end = System.currentTimeMillis();
    System.out.println("Sorted: " + ss);
    //System.out.println("Elapsed Time for Selection Sort: " + (end - start));

    //Linear Search
    System.out.println("(Linear) Index of -2: " + ss.linearSearch(-2));
    System.out.println("(Linear) Index of 11: " + ss.linearSearch(11));
    System.out.println("(Linear) Index of 20: " + ss.linearSearch(20));

    //Binary Search
    System.out.println("Index of -2: " + ss.binarySearch(-2));
    System.out.println("Index of 11: " + ss.binarySearch(11));
    System.out.println("Index of 20: " + ss.binarySearch(20));

    //Recursive Binary Search
    System.out.println("(Recursive) Index of -2: " + ss.binarySearchRecursive(-2, 0, size-1));
    System.out.println("(Recursive) Index of 11: " + ss.binarySearchRecursive(11, 0, size-1));
    System.out.println("(Recursive) Index of 20: " + ss.binarySearchRecursive(20, 0, size-1));

    System.out.println("---------------------------------------------");
    ArrayList<Integer> a = ss.buildIncreasingList(20);
    System.out.println(a);

    // build a second Arraylist here
    ArrayList<Integer> b = ss.buildIncreasingList(20);
    System.out.println(b);

    // test your merge routine here
    System.out.println(ss.merge(a,b));

    System.out.println("---------------------------------------------");
    SortSearch ms = new SortSearch(size);
    System.out.println("Original: " + ms);
    //start = System.currentTimeMillis();
    ms.msort();
    //end = System.currentTimeMillis();
    System.out.println("Sorted: " + ms);
    //System.out.println("Elapsed Time for Merge Sort: " + (end - start));
  }
}