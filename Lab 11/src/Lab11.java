import java.io.FileReader;
import java.util.Scanner;

public class Lab11 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int input;
		
		System.out.println("Enter the year you would like high scores for");
		System.out.print(">: ");
		input = console.nextInt();
		
		console.close();
		
		
		FileReader r = null;
		Scanner s = null;
		
		
		try {
			r = new FileReader("data1.txt");
			s = new Scanner(r);
			s.nextLine();
			
			while (s.hasNext()){
				int num = s.nextInt();
				int score = s.nextInt();
				String firstName = s.next();
				String lastName = s.next();
				int year = s.nextInt();
				if (year == input){
					if (num == 1){
						System.out.printf("%-7s %-10s was in %dst  place with a score of %,d!%n", firstName, lastName, num, score);
					}
					else if (num == 2){
						System.out.printf("%-7s %-10s was in %dnd  place with a score of %,d!%n", firstName, lastName, num, score);
					}
					else if (num == 3){
						System.out.printf("%-7s %-10s was in %drd  place with a score of %,d!%n", firstName, lastName, num, score);
					}
					else if (num < 10){
						System.out.printf("%-7s %-10s was in %dth  place with a score of %,d!%n", firstName, lastName, num, score);
					}
					else {
						System.out.printf("%-7s %-10s was in %dth place with a score of %,d!%n", firstName, lastName, num, score);
					}
				}
				
			}
			
		}
		catch (Exception e) {
			System.out.println("Error reading file!!!");
			System.exit(1);
		}
		
		
	}

}
