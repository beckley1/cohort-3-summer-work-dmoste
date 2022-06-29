import java.io.*;
import java.util.*;
import java.lang.Math;

public class Guess{
	public static void main(String[] args){
    Random random = new Random();
    int number = random.nextInt(100) + 1;
    int guess;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
    System.out.print("Type a number: ");
		guess = in.nextInt();

    System.out.printf("Your guess is: %d\n", guess);
    System.out.printf("The number I was thinking of is: %d\n", number);
    System.out.printf("You were off by: %d\n", Math.abs(number - guess));
		
	}
}