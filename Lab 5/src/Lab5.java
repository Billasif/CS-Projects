import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {
		
		// declare variables
		String firstName;
		String secondName;
		String Grade;
		int studentID;
		String loginName;
		float GPA;
		
		// Scanner 
		Scanner console;
		console = new Scanner(System.in);
		
		System.out.print("Please enter your first name: ");
		firstName = console.nextLine();
		System.out.print("Please enter your second name: ");
		secondName = console.nextLine();
		System.out.print("Please enter what grade you're in: ");
		Grade = console.nextLine();
		System.out.print("Enter your student ID: ");
		studentID = console.nextInt();
		System.out.print("Enter your login name: ");
		loginName = console.next();
		System.out.print("Enter your GPA: ");
		GPA = console.nextFloat();
		
		console.close();
		
		String fullName = secondName + ", " + firstName;
		System.out.printf("%-14s%-14s%-15s%-6s%-12s%n", "Login", "ID", "Name", "GPA", "Grade");
		System.out.printf("%-14s%-14d%-15s%-6.1f%-12s", loginName, studentID, fullName, GPA, Grade);

	}

}
