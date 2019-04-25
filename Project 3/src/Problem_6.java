import java.util.Scanner;

public class Problem_6 {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		int num;
		
		
		System.out.println("Please enter a number");
		num = console.nextInt();
		console.close();
		for (int i = 1; i <= num; i++){
			boolean numberPrime = true;
			
			for (int j = 2; j<i; j++){
				if(i % j == 0){
					numberPrime = false;
				    break;
				}
			}
			if (numberPrime){
				System.out.println(i);
			}
					
		}

	}

}
