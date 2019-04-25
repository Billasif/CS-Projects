import java.util.Scanner;

public class Problem_2 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int start = 0;
		int num;
		
		System.out.print("Please enter a number: ");
		num = console.nextInt();
		console.close();
		
		while (start <= num){
			if (start%2 == 0){
			System.out.println(start);
			start++;
			}
			else{
			start++;
			}
		}

	}

}
