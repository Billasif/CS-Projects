import java.util.Scanner;

public class March03 {

	public static void main(String[] args) {

		int userInput;
		Scanner console;
		final int magicNumber = 8;
		console = new Scanner(System.in);

		// get user input
		System.out.print("Guess a number from 1 to 10: ");
		userInput = console.nextInt();

		System.out.printf("You entered %d!%n", userInput);

		if (userInput >= 1 && userInput <= 10) 
		{
			System.out.println("You entered a valid number!");

			if (userInput == magicNumber) 
			{
				System.out.println("You got it right!!!!");
			} 
			else 
			{
				System.out.println("You entered a valid number but not the one we were looking for");
			}
		} 
		else 
		{
			System.out.println("The number you entered is invalid \nPlease enter a number between 1 and 10!!!");
		}

		if (userInput <= magicNumber + 2 && userInput >= magicNumber - 2) 
		{
			System.out.println("You're close");
		}
		console.close();
	}

}
