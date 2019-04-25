import java.util.Scanner;

public class Problem_3 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int start = 0;
		int num;
		
		System.out.print("Please enter a number: ");
		num = console.nextInt();
		console.close();
		
		while (start <= num){
			if (start >0 && start%3 == 0 && start%5 != 0){
				System.out.println("Fizz " + start);
				start++;
			}
			else if (start >0 && start%3 !=0 && start %5 == 0) {
				System.out.println("\tBuzz " + start);
				start++;
			}
			else if (start > 0 && start%3 == 0 && start%5 == 0){
				System.out.println("\t\tFizzBuzz " + start);
				start++;
			}
			else {
				start++;
			}
			
		}
	}

}
