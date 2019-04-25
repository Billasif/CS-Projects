import java.util.Scanner;

public class Lab_12 {
	public static double distance(double x1, double y1, double x2, double y2){
		double xdiff = x1-x2;
		double ydiff = y1-y2;
		
		if (xdiff * xdiff + ydiff * ydiff >= 0 )
			return Math.sqrt(xdiff * xdiff + ydiff * ydiff);
		return -1;
	}
	public static boolean isPrime(int n){
		boolean numprime = true;
		for (int i = 2; i < n; i++){
			if (n%i == 0){
				numprime = false;
				break;
			}
		}
		return numprime;
	}
	
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		int number;
		
		
		System.out.println("Please enter a number");
		number = console.nextInt();
		console.close();
		
		boolean n = isPrime(number);
		if (n){
			System.out.printf("%d is a prime number", number);
		}
		else{
			System.out.printf("%d is not a prime number", number);
		}
		
		double d = distance(2,3,4,5);
		System.out.printf("%nThe distance is %f", d);

	}

}
