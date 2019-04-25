package sum;

import java.util.Scanner;

//Compute the sum from 0 to a positive integer

public class SumApp {

	static Scanner console = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Enter a number: ");
		int number = console.nextInt();
		System.out.println("The sum from 0 to " + number + " is:" + add(number));

	}
	
	public static int add (int n)
	{
		  System.out.println ("n is now " + n);
		  
		  if (n <= 0) 
		      return 0;

		  return n + add(n-1);
	}

}
