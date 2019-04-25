import java.util.Scanner;

public class IfProject {

	public static void main(String[] args) {
		//
		// Console command
		Scanner console;
		console = new Scanner(System.in);

		System.out.print("Hey, what's your name?");
		String name = console.nextLine();
		System.out.print("Ok, " + name + ", how old are you?");
		int age = console.nextInt();
		console.close();

		// If Statements
		if (age >= 0 && age < 16) {
			System.out.printf("You can't drive %s", name);
		} else if (age >= 16 && age <= 17) {
			System.out.printf("You can drive but you can't vote %s", name);
		} else if (age >= 18 && age <= 24) {
			System.out.printf("You can vote but not rent a car %s", name);
		} else if (age >= 25) {
			System.out.printf("You can do pretty much anything %s", name);
		}
		else
		{
			System.out.printf("You are trying to break my code %s", name);
		}

	}

}
