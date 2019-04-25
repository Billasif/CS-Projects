/**
 * Problem1 class: define and test recursive method printStarPattern()
 * 
 * @Bilal Asif
 * @03/02/2019 
 *
 */

import java.util.Scanner;

public class problem1 {

	//PrintStarPattern Method.  
	public static void printStarPattern(int x) {
		if (x == 0) {//base case
			return;
		}
		else {
			for (int i = 0; i < x; i++) {
				System.out.print("*");
			}
			System.out.println();
			printStarPattern(x - 1);//RecursionprintStarPattern(x - 1);//RecursionprintStarPattern(x - 1);//Recursion

			for (int i = 0; i < x; i++) {//Printes the other half of the stars
				System.out.print("*");
			}
			System.out.println();
			//printStarPattern(x - 1);//Recursion
		}
		
	}
	
	public static void main(String[] args) {
		
		int x;
		Scanner console = new Scanner(System.in);
		System.out.println("Enter Number of stars");
		x = console.nextInt();
		console.close();
		printStarPattern(x);
	}

}
