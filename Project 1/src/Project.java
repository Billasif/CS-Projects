import java.util.Scanner;

public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initilize
		final float feetPerFurlong = 660.00f;
		final float poundsPerFirkin = 56.00f;
		final float secondsPerFortnight = 1209600.00f;
		float furlong;
		float firkin;
		float fortnight;
		float feet;
		float pounds;
		float seconds;
		
		Scanner console;
		
		console = new Scanner(System.in);
		
		//User Input
		System.out.println("Enter onto thus how many furlongs ye be?");
		furlong = console.nextFloat();
		
		System.out.println("How many firkins did thou sayeth that thing weigheth?");
		firkin = console.nextFloat();
		
		System.out.println("How many fortnight be thy holiday?");
		fortnight = console.nextFloat();
		
		console.close();
		
		
		//Conversion
		feet = furlong * feetPerFurlong;
		pounds = firkin * poundsPerFirkin;
		seconds = fortnight * secondsPerFortnight;
		
		//Output		
		System.out.println("You are " + feet + " tall, " + " that thing weighs " + pounds + " pounds, and your holiday was " + seconds  + " seconds long" );

	}

}
