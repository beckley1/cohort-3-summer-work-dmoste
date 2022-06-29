import java.io.*;
import java.util.*;

public class Date{
	public static void main(String[] args){
		String day = "Tuesday";
		int date = 30;
		String month = "November";
		int year = 2021;
		
		System.out.println("American format:");
		System.out.println(day + ", " + month + " " + date + ", " + year);
		System.out.println("European format:");
		System.out.println(day + " " + date + " " + month + " " + year);
	}
}