import java.util.Scanner;

public class Lab7_1 {

	public static void main(String[] args) {
		
		// Declare variables
		Scanner console =  new Scanner(System.in);
		String elvis = "Elvis";
		String name;
		int length;
		char firstLetter;
		
		
		// User input
		System.out.print("PLease enter your name: ");
		name = console.nextLine();
		console.close();
		
		length = name.length();
		firstLetter = name.charAt(0);
		
		
		if (name.equals(elvis)){
			System.out.printf("%n%s has left the building", name);
		}
		else if (length == 7 && firstLetter != 'S'){
			System.out.println("You will be rich");
		}
		else if (firstLetter == 'S' && length != 5){
			System.out.println("You will be famous");
		}
		else if (firstLetter == 'S' && length == 5){
			System.out.println("You will be rich and famous");
		}
		else if (firstLetter == 'T' && length == 8){
			System.out.println("You will be talented");
		}
		else {
			System.out.println("Your forutune is unclear");
		}

	}

}
