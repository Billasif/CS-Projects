import java.util.Scanner;

public class March_31P2 {

	public static void main(String[] args) {
		
		
		Scanner console = new Scanner(System.in);
		int userinput = 0;
		
		while (userinput != 1 && userinput !=2){
		System.out.println("Pick one");
		System.out.println("1. Dog");
		System.out.println("2. Cat");
		System.out.println(">");
		userinput = console.nextInt();

		if (userinput == 1){
			System.out.println("Dog is a good choice if you like walking");
		}
		else if (userinput == 2){
			System.out.println("Cat is a good choice if you want to be scratched");
		}
		else{
			System.out.println("Invalid input.  Please enter 1 or 2");
		}
		}
		console.close();
	}

}
