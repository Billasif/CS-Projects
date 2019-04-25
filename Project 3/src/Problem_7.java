import java.util.Scanner;

public class Problem_7 {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		int num;
		float sum = 0;
		int count = 0;
		
		do{
			System.out.println("Please enter a number");
			System.out.print("\t>: ");
			num = console.nextInt();
			count++;
			sum += num;
			System.out.println(sum);
		}
		while(num != -1);
		sum /= count;
		System.out.println(sum);
		System.out.println(count);
		console.close();
	}

}
