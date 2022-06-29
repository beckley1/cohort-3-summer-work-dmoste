import java.io.*;
import java.util.*;

public class Celsius{
	public static void main(String[] args){
		double temperatureInC;
		double temperatureInF;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Temperature in C: ");
		temperatureInC = in.nextDouble();
		
		temperatureInF = (temperatureInC * 9 / 5) + 32;
		System.out.printf("%.1f C = %.1f F", temperatureInC, temperatureInF);
		
	}
}