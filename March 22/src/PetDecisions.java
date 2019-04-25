import java.util.Scanner;

public class PetDecisions {

	public static void main(String[] args) {
		
		// declare variables
		Scanner console = new Scanner(System.in);
		int activity;
		int type;
		
		System.out.println("What kind of pet would you like?");
		System.out.println("\t1) Active");
		System.out.println("\t2) Inactive");
		System.out.print("Input: ");
		
		activity = console.nextInt();
		
		System.out.println("What kind of pet would you like?");
		System.out.println("\t1) Outside");
		System.out.println("\t2) Inside");
		System.out.println("\t3) Both");
		System.out.print("Input: ");
		
		type = console.nextInt();
		
		if (activity == 1 && type == 1){
			System.out.println("Get a Horse");
		}
		else if (activity == 1 && type == 2){
			System.out.println("Get a fish");
		}
		else if (activity == 1 && type == 3){
			System.out.println("Get a dog");
		}
		else if (activity == 2 && type == 1){
			System.out.println("Get a Tree");
		}
		else if (activity == 2 && type == 2){
			System.out.println("Get a fern");
		}
		else if (activity == 2 && type == 3){
			System.out.println("Don't get a pet");
		}
		else {
			System.out.println("You're not serious about this are you?");
		}
		console.close();
	}

}
