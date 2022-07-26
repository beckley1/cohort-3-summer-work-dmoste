import java.io.*;
import java.util.*;

/*
Sort Project:
Part 1:  (BASIC)
  1. Analyze the two constructors - try to figure out how they work.
  2. Compile and run the program (SortProjectDriver.java and SortProject.java) and confirm
  the behavior of the constructors.
  Part 2: (BASIC)
  1. Read the description of findSmallestIndex and complete the method.
  2. Uncomment the lines in SortProjectDriver to test.
  Part 3: (INTERMEDIATE)
  1. Complete the sort method - read comments for description
  2. Uncomment the lines in sortProjectDriver to test.
Search Project:
  1. Complete the linear search (BASIC)
  2. Complete the binary search (Intermediate)
  3. Complete the recursive version of binary search (Advanced)
*/

public class SortSearch{

  /* Sort project starts here */
  
  /* Instance Variables */
  private ArrayList<Integer> data;  // to store the data
  
  private Random r; 

  
  public SortSearch(){
    data = new ArrayList<Integer>();
    r = new Random();
    for (int i = 0; i < 15; i++){
      data.add(r.nextInt(20));
    }
  }
  
  public SortSearch(int size){
    data = new ArrayList<Integer>();
    r = new Random();
    for (int i = 0; i < size; i++){
      data.add(r.nextInt(20));
    }
  }

  /* Convenience function to get data out of the ArrayList from the driver */
  public int get(int index){
    return this.data.get(index);
  }
    


  /*
    return the index of the smallest data item from index start to the end
    of the ArrayList. If there are multiple of the smallest value,
    return any of them.
    
    Example, if the arraylist has:
    5,3,10,6,8
    if start was 2 (start at index 2, value 10) then it would return 3
    which is the index of the value 6 which is the index with the
    smallest value from start to end
    On the otherh and, if start was 0, then the method would
    return 1 since the value 3 is in index 1 and that is the smallest.
    
  */
  public int findSmallestIndex(int start){
    int smallIndex = start;
    int minVal = get(start);

    for(int i = start+1; i < data.size(); i++){
      if(get(i) < minVal){
        minVal = get(i);
        smallIndex = i;
      }
    }
    
    return smallIndex;
  }


  /**
     Implement the selection sort algorithm by sorting the ArrayList
     data in place.
     Algorithm:
     Loop a variable that represents the ArrayList index from
     0 to the end of the ArrayList.
       For each index, find the smallest from that Location
 to the end of the array and swap it with that index.
 
     
  */
  public void sort(){     
    for(int i = 0; i < data.size(); i++){
      int currentVal = get(i);
      int smallIndex = findSmallestIndex(i);
      
      data.set(i, get(smallIndex));
      data.set(smallIndex, currentVal);
    }

  }



  /* Search project starts here */
  
  /**
     performs a linear search. Returns the index of the first occurence of
     value in the ArrayList data or -1 if not found.
     This works by starting at the first element and searching one element at a time 
     until either the element is found or you've looked at all the elements.
     This algorithm works on any ArrayList.
  */
  public int linearSearch(int value){
    for(int i = 0; i < data.size(); i++){
      if(get(i) == value){
        return i;
      }
    }

    return -1;
  }
    
  /**
     Implement a binary search as specified by the comments
     
     This algorithm only works on sorted ArrayLists.
  */
  public int binarySearch(int value){
// create assign variables  representing the high, low and middle indices 
// while we're not done:
//   if the item is at data.get(middle), return middle
//   otherwise, update high, low, and middle
    int high = data.size()-1;
    int low = 0;
    int mid = (high + low)/2;

    while(low <= high){
      if(get(mid) == value){
        return mid;
      }else if(get(mid) > value){
        high = mid - 1;
        mid = (high + low)/2;
      }else if(get(mid) < value){
        low = mid + 1;
        mid = (high + low)/2;
      }
    }
    
    return -1;
  }
    
  /**
     Implement a RECURSIVE binary search as specified by the comments
     
     This algorithm only works on sorted ArrayLists.
  */

  public int binarySearchRecursive(int value, int lowIndex, int highIndex){

// refer to class discussion
    int mid = (lowIndex + highIndex)/2;

    if(lowIndex > highIndex){
     return -1; 
    }else if (get(mid) == value) {
      return mid;
    }else if (get(mid) > value) {
      return binarySearchRecursive(value, lowIndex, mid - 1);
    }else{
      return binarySearchRecursive(value, mid + 1, highIndex);
    } 
  }
    
	
  public String toString(){
    return ""+data;
  };


  public void builtinSort(){
    Collections.sort(data);

  }

  /* Merge Sort Stuff after here */
      /**
         Builds and returns an ArrayList that's already in increasing order.
         You can use this method to test your merge method.
      */
    public ArrayList<Integer> buildIncreasingList(int size){
      ArrayList<Integer>  newlist = new ArrayList<Integer>();
      Random r = new Random();
      int nextval = r.nextInt(20)+1;
      for (int i=0;i<size;i++){
        newlist.add(nextval);
        nextval = nextval + r.nextInt(20);
      }
  
      return newlist;
    }
    
  /**
     this routine should create and return a new ArrayList of
     integers and fill it by merging list1 and list2 into the new
     list.
     list1 and list2 are already sorted in increasing order.
     Example:
     If list1 contains [1,5,17,25]
     and list2 contains [3,6,10,30,40,50]
     The new list will contain:
     [1, 3, 5, 6, 10, 17, 25, 30, 40, 50]
     
  */
           
  public ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2){

    // code for merge
    ArrayList<Integer> merged = new ArrayList<Integer>();
    int i = 0;
    int j = 0;

    while(i < list1.size() && j < list2.size()){
      if(list1.get(i) <= list2.get(j)){
        merged.add(list1.get(i));
        i++;
      }else{
        merged.add(list2.get(j));
        j++;
      }
    }

    while(i < list1.size()){
      merged.add(list1.get(i));
      i++;
    }

    while(j < list2.size()){
      merged.add(list2.get(j));
      j++;
    }
    
    return merged; // replace this line
  }

  public ArrayList<Integer> mergeSort(ArrayList<Integer> list){
    if(list.size() < 2){
      return list;
    }else{
      ArrayList<Integer> left = new ArrayList<Integer>(list.subList(0, list.size()/2));
      ArrayList<Integer> right = new ArrayList<Integer>(list.subList(list.size()/2, list.size()));

      left = mergeSort(left);
      right = mergeSort(right);

      return merge(left, right);
    }
  }

  public void msort(){
      data =  mergeSort(data);
  }
  
}