import java.io.*;
import java.util.*;

public class Max{
  public static int indexOfMax(int[] a){
    double negInf = Double.NEGATIVE_INFINITY;
    int largest_value = (int)negInf;
    int index = 0;

    for(int i = 0; i < a.length; i++){
      if(a[i] > largest_value){
        largest_value = a[i];
        index = i;
      }
    }

    return index;
  }

  public static void main(String[] args){
    int[] a = {0,1,2,6,4,5};

    int index = indexOfMax(a);
    System.out.println(index);
  }
}