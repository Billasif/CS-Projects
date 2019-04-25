import java.util.Scanner;

public class April_12 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int choice;
		
		
		do{
		System.out.println("Please pick a genre of music");
		System.out.println("\t1. Rock");
		System.out.println("\t2. Country");
		System.out.println("\t3. Smooth Jazz");
		System.out.print("> ");
		choice = console.nextInt();
		}
		while (choice < 1 || choice > 3);
		console.close();

	}

}
