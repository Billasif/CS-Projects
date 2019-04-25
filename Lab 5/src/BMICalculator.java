import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		// declare variables
		String header;
		int feet;
		int inches;
		int pounds;
		float kg;
		float meters;
		float BMI;
		final int inchesInFeet = 12;
		final float kilogramsInPounds = .453592f;
		final float metersInInches = .0254f;
		
		// Initialize scanner
		Scanner console = new Scanner(System.in);
		
		header = "Height (m)   Weight (kg)   BMI";
		
		// User input
		System.out.println("**************************");
		System.out.println("* -BMI Calculator- *");
		System.out.println("**************************");
		System.out.println("Enter height by entering\nfeet followed by inches. ");
		System.out.print("Enter feet: ");
		feet = console.nextInt();
		System.out.print("Enter remaining inches: ");
		inches = console.nextInt();
		System.out.print("Enter weight in pounds: ");	
		pounds = console.nextInt();
		
		console.close();
		
		// Conversion
		int convert = feet * inchesInFeet;
		meters = (float) (metersInInches * (inches + convert));
		kg = (float) (kilogramsInPounds * pounds);
		
		BMI = kg / (meters * meters);
		
		// Results
		System.out.println("Here are your results:\n");
		System.out.println(header);
		
		System.out.printf("%-13.2f%-14.0f%.1f", meters, kg, BMI);

	}

}
