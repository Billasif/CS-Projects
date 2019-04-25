import java.util.Scanner;

public class Lab_8 {

	public static void main(String[] args) {
		
		// Declare variables
		Scanner console = new Scanner(System.in);
		String Carswell = "Carswell";
		String Jones = "Jones";
		String Smith = "Smith";
		String Young = "Young";
		String lastName;
		int resultCarswell;
		int resultJones;
		int resultSmith;
		int resultYoung;
		
		System.out.println("What is your last name?");
		lastName = console.nextLine();
		console.close();
		
		resultCarswell = lastName.compareToIgnoreCase(Carswell);
		resultJones = lastName.compareToIgnoreCase(Jones);
		resultSmith = lastName.compareToIgnoreCase(Smith);
		resultYoung = lastName.compareToIgnoreCase(Young);
		
		if (resultCarswell <= 0){
			System.out.printf("You don't have to wait long %s", lastName);
		}
		else if (resultCarswell > 0 && resultJones <= 0){
			System.out.printf("That's not too bad of a wait %s", lastName);
		}
		else if (resultJones > 0 && resultSmith <= 0){
			System.out.printf("You may have to wait a bit %s", lastName);
		}
		else if (resultSmith > 0 && resultYoung <= 0){
			System.out.printf("Sorry to tell you %s but its going to be a while", lastName);
		}
		else {
			System.out.printf("You may want to bring a book %s", lastName);
		}
		
		
		
		
		

	}

}
