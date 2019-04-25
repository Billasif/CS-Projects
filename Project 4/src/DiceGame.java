import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

//---------------------------------------------------------------------------
// Program:  DiceGame.java
// Purpose:  This is an implementation of a dice game. When the game starts, 
//           the player has 1000 points.
//           The player starts by wagering a number of points.
//           Then the player rolls a pair of dice. 
//           If the total of the face values of the dice add up to more than
//           seven or the face values are equal, then the player wins. 
//           Otherwise the player loses. A winning roll will add the wager to the total points.
//           A losing roll causes the player to lose the wager. 
//---------------------------------------------------------------------------

public class DiceGame {
	
	public static Scanner reader = new Scanner(System.in);
	
	// ---------------------------------------------------------------------------
	// Name: RollDie
	// Parameters: None
	// Returns: int
	// Purpose: rolls one die
	// ---------------------------------------------------------------------------
	public static int RollDie(){
		Random r = new Random();
		int num = r.nextInt(6)+1;
		return num;
	}
	
	
	// ---------------------------------------------------------------------------
	// Name: CheckWinner
	// Parameters: two integers
	// Returns: boolean
	// Purpose: check if the dice roll is a winning combination
	// ---------------------------------------------------------------------------
	public static boolean CheckWinner(int x, int y){
		
		if (x == y || x + y > 7)
			return true;
		else
			return false;
		
	}
	
	
	// ---------------------------------------------------------------------------
	// Name: PrintDice
	// Parameters: none
	// Returns: void
	// Purpose: Output dice pattern
	// ---------------------------------------------------------------------------
	public static void PrintDice() {
		System.out.println("        .-------.    ______      \n" + "       /   o   /|   /\\     \\   \n"
				+ "      /_______/o|  /o \\  o  \\  \n" + "      | o     | | /   o\\_____\\ \n"
				+ "      |   o   |o/ \\o   /o    /  \n" + "      |     o |/   \\ o/  o  /   \n"
				+ "      '-------'     \\/____o/    \n\n\n");
	}

	// ---------------------------------------------------------------------------
	// Name: ShowHomeScreen
	// Parameters: integer (total points so far) 
	// Returns: nothing 
	// Purpose: print a message for the user including the current number of points
	// ---------------------------------------------------------------------------
	public static void ShowHomeScreen(int points)
	{
		System.out.print("\n\n             Dice Game!          \n");
		PrintDice();
	    System.out.println("***********Instructions************\n"
	         + "Roll the dice. If the face values \n"
	         + "are equal or add up to more than 7,\n"
	         + "you win!\n\n"
		     + "**********Total Points*************\n"
		     + "Total: " + points + "\n");
	}
	
	// ---------------------------------------------------------------------------
	// Name: GetWager
	// Parameters:int
	// Returns:int
	// Purpose:To get the wager from user and check if wager is valid
	// ---------------------------------------------------------------------------
	public static int GetWager(int Points){
		int Wager;
		do {
		System.out.println("What would you like to wager?");
		System.out.println("***Hint: You can't wager more points than you have***");
		System.out.print("\t>");
		Wager = reader.nextInt();
		}
		while (Wager > Points || Wager < 0);
		return Wager;
	}


	
	// ---------------------------------------------------------------------------
	// Name: ConfirmContinue
	// Parameters: integer (total points)
	// Returns: boolean (true or false depending on user input)
	// Purpose: check if the user wants to continue playing the game
	// ---------------------------------------------------------------------------
	public static boolean ConfirmContinue(int TotalPoints)
	{
		boolean conf = false;
		String input;
		if (TotalPoints <= 0)
		{
			System.out.print("You do not have enough points to continue\n");
			return false;
		}

		System.out.print("Would you like to roll again (Y/N)? ");
		input = reader.nextLine();
		input = reader.nextLine();

		while (!(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("n"))) {
			System.out.print("Please enter Y or N. Would you like to roll again (Y/N)? ");
			reader = new Scanner(System.in);
			input = reader.nextLine();
		}
		
		if (input.equalsIgnoreCase("y"))
			conf = true;
		else if (input.equalsIgnoreCase("n"))
			conf = false;

		return conf;
	}
	
	
	// ---------------------------------------------------------------------------
	// Method calls in main have been commented out so that this code will
	// compile. It is you task to write these methods. Once a method
	// has been written, you can uncomment its method call to see if the
	// method works. DO NOT change the method calls.
	public static void main(String[] args) throws IOException {
		// Declare Variables
		int totalPoints = 1000;
		int wager = 0;
		int die1 = 0;
		int die2 = 0;
		boolean confirm = false;
		boolean winner = false;

				
		// Show home screen (HINT: You must write a method that shows the
		// homescreen and then call the method)
		ShowHomeScreen(totalPoints);

		// Each loop is one roll of the dice
		do {
			wager = GetWager(totalPoints); // Get the amount of points wagered on this roll
			System.out.println(wager);
			die1 = RollDie(); // Roll first die
			die2 = RollDie(); // Roll second die
			
			System.out.println("\n***********************************");
			System.out.printf("*     You rolled a %d and %d!       *%n", die1, die2);
			System.out.println("***********************************");
			
			
			// check if the dice roll is a winning combo
			winner = CheckWinner(die1, die2); // Determine if the roll was a winning roll
			
			if (winner)
			{
				// If the roll was a winning roll, add the wager to the total points
				totalPoints += wager; 
				// Tell the player that she has won
				System.out.println("*    Congratulations, You Win!    *\n*   You have doubled your wager.  *");
				
			}
			else
			{
				// If the roll was not a winner, deduct the wager from the total points
				totalPoints -= wager; 
				// Tell the player that she has lost
				System.out.println("*            You Lose.            *");
			}
			System.out.println("***********************************");
			
			ShowHomeScreen(totalPoints); // Show home screen
			
	        // Make sure the player has sufficient points to continue
	        // and ask if the player wants to roll again
	        // call the ConfirmContinue method here
			confirm = ConfirmContinue(totalPoints);

		} while (confirm);
		
		reader.close();
	}

}
