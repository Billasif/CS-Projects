/**
 * Problem2 class: define and test power raising
 * 
 * @Bilal Asif
 * @03/02/2019 
 *
 */import java.util.Scanner;

public class problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Asking user to enter info
		int num;
		int pow;
		Scanner console = new Scanner(System.in);
		System.out.println("Enter the number you to raise to a power");
		num = console.nextInt();
		System.out.println("Enter the power you want to raise it to");
		pow = console.nextInt();
		
		System.out.println(num + " raised to the power of " + pow + " is " + power(num,pow));
		console.close();

	}

    public static int power(int num, int power) {//Function to calculate power
        if (power == 0)//base case
            return 1;
        else
            return (num * power(num, power - 1));//Recursively calling itself and multiplying
    }
}
