import java.util.Scanner;

public class Problem_1 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int start = 0;
		int num;
		
		System.out.print("Please enter a number: ");
		num = console.nextInt();
		console.close();
		
		while (start <= num){
			System.out.println(start);
			start++;
		}
		
	}

}
