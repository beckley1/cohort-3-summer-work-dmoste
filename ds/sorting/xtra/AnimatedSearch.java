import java.io.*;
import java.util.*;

/*
This is an extension in which binary search is animated
*/

public class AnimatedSearch{

    /* Sort project starts here */
    
    /* Instance Variables */
    private ArrayList<Integer> data;  // to store the data
    
    private Random r; 

    
    public AnimatedSearch(){
	    data = new ArrayList<Integer>();
	    r = new Random();
	    for (int i = 0; i < 15; i++){
	      data.add(r.nextInt(20));
	    }
    }
    
    public AnimatedSearch(int size){
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
    
	
    public String toString(){
	    return ""+data;
    };


    public void builtinSort(){
	    Collections.sort(data);
	
    }

    public int binarySearchAnimated(int value){

      //clear the shell and hide the cursor
      System.out.print("\033[2J\033[?25l");

	// create assign variables  representing the high, low and middle indices 
	// while we're not done:
	//   if the item is at data.get(middle), return middle
	//   otherwise, update high, low, and middle
      int high = data.size()-1;
      int low = 0;
      int mid = (high + low)/2;

      while(low <= high){
        animate(high, mid, low, value);
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
      
      //show the cursor
      System.out.print("\033[?25h");
	    return -1;
    }
    public void delay(int n)
    {
      try {
        Thread.sleep(n);
      }  
      catch(InterruptedException e) {}
    }

    public void animate(int high, int mid, int low, int value)
    {
      char[] names = new char[data.size()];
      char[] locs = new char[data.size()];

      for(int i = 0 ; i < data.size(); i++){
        if(i == low){
          names[i] = 'l';
          locs[i] = '^';
        }else if(i == mid){
          names[i] = 'm';
          locs[i] = '^';
        }else if(i == high){
          names[i] = 'h';
          locs[i] = '^';
        }else{
          names[i] = ' ';
          locs[i] = ' ';
        }
      }
      //place cursor at origin (upper left)
      System.out.print("\033[0;0H\n");

      System.out.println("Finding " + value);
  
      System.out.println(Arrays.toString(data.toArray()));
      System.out.println(Arrays.toString(locs));
      System.out.println(Arrays.toString(names));
      System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - ");
  
      delay(1000);
    }
    
}