import java.io.*;
import java.util.*;

public class Time{
	public static void main(String[] args){
		int hour = 15;
		int minute = 21;
		int second = 0;
		
		float elapsed = (((hour * 60) + minute) * 60) + second;
		float remaining = 86400 - elapsed;
		float percentage = (elapsed/86400) * 100;
		
		System.out.println("It has been " + elapsed + " seconds since midnight");
		System.out.println("There are " + remaining + " seconds remaining in the day");
		System.out.println(percentage + "% of the day has passed");
		
		int new_hour = 15;
		int new_minute = 31;
		int new_second = 0;
		
		float new_elapsed = ((((new_hour * 60) + new_minute) * 60) + new_second) - elapsed;
		
		System.out.println("It took " + new_elapsed + " seconds to write this program");
	}
}