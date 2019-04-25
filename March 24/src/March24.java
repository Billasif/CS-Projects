import java.util.Scanner;

public class March24 {

	public static void main(String[] args) {
		
		// Declare variables
		Scanner console = new Scanner(System.in);
		int input;
		
		
		
		// Display menu
		System.out.println("Pick a message: ");
		System.out.println("\t1. Hello");
		System.out.println("\t2. Goodbye");
		System.out.println("\t3. Hello World");
		System.out.println("\t4. Goodbye World");
		
		System.out.print("> ");
		
		input = console.nextInt();
		console.close();
		
		switch(input){
		case 1:
			System.out.println("You picked \"Hello\"!");
			break;
		case 2:
			System.out.println("You picked \"Goodbye\"!");
			break;
		case 3:
			System.out.println("You picked \"Hello World\"!");
			break;
		case 4:
			System.out.println("You picked \"Goodbye World\"!");
			break;
		default:
			System.out.println("You picked an invalid number");
			break;
		}

	}

}
