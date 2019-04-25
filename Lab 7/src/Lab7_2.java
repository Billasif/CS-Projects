import java.util.Scanner;

public class Lab7_2 {

	public static void main(String[] args) {
		
		//Declare variables
		Scanner console = new Scanner(System.in);
		String input;
	
		
		//Prompt the user
		System.out.println("What day is it?");
		input = console.nextLine();
		
		console.close();
		
		
		System.out.printf("You entered %s%n", input);
		
		switch(input.toLowerCase()){
		case "saturday":
		case "sunday":
			System.out.println("It's the weekend");
			break;
		case "monday":
			System.out.println("Back to school");
			break;
		case "tuesday":
		case "wednesday":
			System.out.println("Recitation Session Tonight!");
			break;
		case "thursday":
			System.out.println("Information Overload!");
			break;
		case "friday":
			System.out.println("Homework due");
			break;
		}
	}

}
