import java.io.*;
import java.util.*;

public class Methods{
	public static boolean isDivisible(int n, int m){
		boolean isDiv = n % m == 0;
		
		return isDiv;
	}
	
	public static boolean isTriangle(int a, int b, int c){
		boolean isTri;
		
		if(a + b < c){
			isTri = false;
		}else if(a + c < b){
			isTri = false;
		}else if(b + c < a){
			isTri = false;
		}else{
			isTri = true;
		}
		
		return isTri;
	}
	
	public static int ack(int m, int n){
		int A;
		
		if(m == 0){
			A = n + 1;
		}else if(n == 0){
			A = ack(m - 1, 1);
		}else{
			A = ack(m - 1, ack(m, n-1));
		}
		
		return A;
	}
	
	public static void main(String[] args){
		boolean x = isDivisible(4,2);
		System.out.println(x);

		boolean y = isTriangle(4,2,5);
		System.out.println(y);
		
		int z = ack(3,3);
		System.out.println(z);
	}
}