import java.util.Scanner;

public class Problem_4 {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		int num;
		
		System.out.println("Please enter a number: ");
		num = console.nextInt();
		console.close();
		
		for (int i = 0; i < num; i++){
			System.out.print("*");
		}
		
	}

}
