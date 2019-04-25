import java.util.Scanner;

public class Lab_9 {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		int number;
		int guess;
		int count = 0; 
		number = (int) (Math.random() * 20);
		
		System.out.println(number);
		do {
			System.out.print("Guess a number between 1 and 20: ");
			guess = console.nextInt();
			if (number == guess){
				System.out.printf("%d was the right number!!!!", guess);
				break;
			}
			if (number < guess){
				int posdiff = (guess - number);
				if (posdiff >= 5){
					System.out.println("You're cold");
				}
				else if (posdiff == 3 || posdiff == 4){
					System.out.println("You're cooling off");
				}
				else if (posdiff == 2){
					System.out.println("You're getting warm");
				}
				else if (posdiff == 1){
					System.out.println("You're really hot");
				}
				count++;
			}
			if (number > guess){
				int negdiff = (number - guess);
				if (negdiff >= 5){
					System.out.println("You're cold");
				}
				else if (negdiff == 3 || negdiff == 4){
					System.out.println("You're cooling off");
				}
				else if (negdiff == 2){
					System.out.println("You're getting warm");
				}
				else if (negdiff == 1){
					System.out.println("You're really hot");
				}
				count++;
			}
			
		}
		while (count < 3);
		
		
		console.close();
	}

}
