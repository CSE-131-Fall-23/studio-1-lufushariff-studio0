package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
	
		System.out.println("Enter a year");
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		
		boolean four = (n1%4 == 0);
		boolean hundred = ((n1%100 != 0) || (n1%400 == 0)); 
		boolean output = four && hundred;
		
		System.out.println(n1 + " is a leap year: " + output );

	}

}
