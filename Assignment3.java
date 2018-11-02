//***********************************************************
// Name:  Anthony Weringer
// Title: Assignment3.java
// Description: Enter integers to find GCD
// Time spent: 2 hours
// Date: 9/2/17
//
// Part 1
// A) 10 9 8 7 6 5 4 3 2
// B) 5 15
//
// Part 2
// import java.util.Scanner;
// public class part 2
// public static void main (String[] args)
// {
// Scanner scan = new Scanner(System.in);
// System.out.println("Enter something: ");
// String str = scan.nextLine();
// for (int i = (str.length() - 1); i >= 0; i--) {
//      System.out.print(str.charAt(i));
// }
// }
// }
//
//***********************************************************

import java.util.Scanner;


public class Assignment3 {
	
	public static void main(String[] args) 
	{
		/*Prompts user for integer inputs*/
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first integer: ");
		int x = in.nextInt();
		System.out.println("Enter the second integer: ");
		int y = in.nextInt();
		int originalX = x;
		int originalY = y;

		while (x != y)
		{
			if (x > y)
			{
				x = x - y;
			}
			else
			{
				y = y - x;
			}
		}
		/*Gives the user the two integers entered and the gcd*/
		System.out.println("The gcd of " + originalX + " and " + originalY  + " is " + x);
	}

}
