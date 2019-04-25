import java.util.Scanner;

public class AdventureGame {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		String elvis = "Elvis";
		String name;
		
		System.out.println("What's your name?");
		name = console.nextLine();
		
		System.out.printf("You entered %s.", name);
		
		char firstLetter = name.charAt(0);
		
		if (name.equals(elvis)){
			System.out.printf("%nElvis has left the building!%n");
		}
		
		if (firstLetter == 'S' && firstLetter == 's'){
			System.out.println("\nFirst letter is s");
		}
		// (!(firstLetter == 'N')) is the same as firstLetter != 'N'
		if (!(firstLetter == 'N'));{
			System.out.println("FIrst letter is not n");
		}
		console.close();
	}

}
