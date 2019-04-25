import java.util.Scanner;

public class Project2 {

	public static void main(String[] args) {
		
		// Declare variables
		int first;
		int second;
		int third;
		int fourth;
		int fifth;
		int correct = 0;
		int nonSensical = 0;
		Scanner console = new Scanner(System.in);
		
		// Get user input
		System.out.println("What would you classify the variable 1.0 as in Java?");
		System.out.println("1. int");
		System.out.println("2. char");
		System.out.println("3. float");
		System.out.println("4. boolean");
		System.out.print("Answer: ");
		first = console.nextInt();
		
		System.out.println("If you wanted to declare the letter a, which would be the proper way?");
		System.out.println("1. char \"a\"");
		System.out.println("2. char 'a'");
		System.out.println("3. int 'a'");
		System.out.println("4. String \"a\"");
		System.out.print("Answer: ");
		second = console.nextInt();
		
		System.out.println("Which of the following isn't a primitive data type?");
		System.out.println("1. char");
		System.out.println("2. double");
		System.out.println("3. String");
		System.out.println("4. int");
		System.out.print("Answer: ");
		third = console.nextInt();
		
		System.out.println("You can declare a variable after you use it");
		System.out.println("1. True");
		System.out.println("2. False");
		System.out.print("Answer: ");
		fourth = console.nextInt();
		
		System.out.println("You can use an int for variable 1.0");
		System.out.println("1. True");
		System.out.println("2. False");
		System.out.print("Answer: ");
		fifth = console.nextInt();
		
		console.close();
		
		// If statements
		if (first == 3){
			correct = correct + 1;
		}
		else if ( first != 1 || first != 2 || first != 4){
			nonSensical = nonSensical + 1;
		}
		if (second == 2){
			correct = correct + 1;
		}
		else if (second != 1 || second != 3|| second != 4){
			nonSensical = nonSensical + 1;
		}
		if (third == 3){
			correct = correct + 1;
		}
		else if (third != 1 || third != 2 || third != 4){
			nonSensical = nonSensical + 1;
		}
		if (fourth == 2){
			correct = correct + 1;
		}
		else if (fourth != 1){
			nonSensical = nonSensical + 1;
		}
		if (fifth == 2){
			correct = correct + 1;
		}
		else if (fifth != 1){
			nonSensical = nonSensical + 1;
		}
		
		
		// Switch statement
		
		switch (correct){
		case 1:
			System.out.printf("You only got %d right.  Please study harder", correct);
			break;
		case 2: 
			System.out.printf("You got %d right.  Need to study more", correct);
			break;
		case 3:
			System.out.printf("You got %d right.  You did ok", correct);
			break;
		case 4: 
			System.out.printf("You got %d out of 5 right.  Good job", correct);
			break;
		case 5:
			System.out.printf("Wow %d out of 5.  Perfect score", correct);
			break;
		
		}
		if (nonSensical > 0){
		System.out.printf("%nYou entered %d nonsensical statements.  Please try to only enter integers", nonSensical);
		}
	}

}
