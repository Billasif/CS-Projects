import java.util.Scanner;

public class PinLockout {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		final int correctPin = 12345;
		int input;
		int count = 0;
		
		do{
			System.out.print("Enter pin: ");
			input = console.nextInt();
			count++;
		}while(count < 3 && count != correctPin);
		
		if (input == correctPin){
			System.out.println("Correct Pin!!!!");
		}
		else {
			System.out.println("You've been locked out of your account");
		}
				
		console.close();
	}

}
