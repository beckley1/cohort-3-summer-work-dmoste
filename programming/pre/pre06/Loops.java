import java.io.*;
import java.util.*;
import java.lang.Math;

public class Loops{
  public static double squareRoot(double a){
		double initial_guess = a/2;
    double new_guess = 1;
    double difference;

    do{
      new_guess = (initial_guess + (a/initial_guess))/2;
      difference = Math.abs(new_guess - initial_guess);
      initial_guess = new_guess;
    } while(difference > 0.0001);
		
		return new_guess;
	}
  
	public static double power(double x, int n){
		double result = x;
		
		for(int i = 1; i < n; i++){
			result = result * x;
		}
		
		return result;
	}
	
	public static double factorial(double n){
		double result = 1;
		
		for(double i = n; i > 1; i--){
			result = result * i;
		}
		
		return result;
	}
	
	public static void main(String[] args){
    double z = squareRoot(9);
		System.out.println(z);
    
		double x = power(4.0,3);
		System.out.println(x);
		
		double y = factorial(7);
		System.out.println(y);
	}
}