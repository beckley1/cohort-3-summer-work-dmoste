import java.io.*;
import java.util.*;

public class Array{
	public static double[] powArray(double[] a, int n){

		for (int i = 0; i < a.length; i++) {
			a[i] = Math.pow(a[i], n);
		}
		
		return a;
	}
	
	public static int[] histogram(int[] values, int counters){
		int[] counts = new int[counters];
		
		for (int value : values) {
			counts[value]++;
		}
		
		return counts;
	}
	
	public static void main(String[] args){
		double[] a = {1,2,3,4,5};
		
		double[] x = powArray(a, 2);
		System.out.println(Arrays.toString(x));

    int[] b = {0,1,2,4,4};
    
    int[] y = histogram(b, 5);
    System.out.println(Arrays.toString(y));
	}
}