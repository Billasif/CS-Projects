import java.util.Scanner;

public class Problem_5 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int num;
		
		System.out.println("Please enter a number: ");
		num = console.nextInt();
		console.close();
		
		for (int i = 0; i < num; i++){
			for (int j = 0; j < num; j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

}
