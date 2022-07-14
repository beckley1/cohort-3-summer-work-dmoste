import java.io.*;
import java.util.*;

public class PairPro{
  public static void barGraphify(int[] nums){
    for(int i = 0; i < nums.length; i++){
      System.out.printf("%d: ", i);
      for(int j = 0; j < nums[i]; j++){
        System.out.print("=");
      }
      System.out.println("");
    }

  }

  public static void vBarGraphify(int[] nums){
    int maxval = 0;

    for(int i = 0; i < nums.length; i++){
      if(nums[i] > maxval){
        maxval = nums[i];
      }
    }

    for(int i = maxval; i >= 0; i--){
      for(int j = 0; j < nums.length; j++){
        if(nums[j] >= i){
          System.out.print(" * ");
        }else{
          System.out.print("   ");
        }
      } 
      System.out.println();
    }

    for(int i = 0; i < nums.length; i++){
      System.out.print(" " + i + " ");
    }
    System.out.println();
  }
  
  public static void main(String[] args){
    int[] data = new int[]{7,2,3,0,10,2};

    barGraphify(data);
    System.out.println();
    vBarGraphify(data);
  }
}