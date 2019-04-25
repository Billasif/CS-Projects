import java.util.Scanner;

public class Problem_8 {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		float num;
		
		do{
			System.out.println("Please enter a positive number");
			System.out.println("\t>: ");
			num = console.nextFloat();
		}
		while (num < 0);
		console.close();
		
		System.out.printf("The square root of your number was %.1f", (float) Math.sqrt(num));

	}

}
