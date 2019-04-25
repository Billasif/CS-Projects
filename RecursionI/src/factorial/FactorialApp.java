package factorial;

import java.util.Scanner;

//compute factorial of an integer

public class FactorialApp {
	
	static Scanner console = new Scanner (System.in);

	public static void main(String[] args) {
		
		System.out.print("Enter a number: ");
		int number = console.nextInt();
		System.out.println("The factorial of " + number + " is:" + factorial(number));

	}

	public static int factorial(int n) {
		
		if (n==0)   return 1;

		int partialfactorial = factorial(n-1);
		int result = n * partialfactorial;
		return result;
	}

}
