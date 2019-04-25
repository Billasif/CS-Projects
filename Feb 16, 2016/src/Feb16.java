import java.util.Scanner;

public class Feb16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declare Constants
		final int secondsPerHour = 3600;
		final int secondsPerMin  = 60;
		
		// Declare variables
		int seconds;
		int hours;
		int minutes;
		int remaindersec;
		int remainderhrs;
		Scanner console;
		
		// initialize variables
		console = new Scanner(System.in);
		
		// User Input
		System.out.print("Please enter the number of seconds you wish to convert:  ");
		seconds = console.nextInt();
		
		System.out.println("You entered " + seconds + " seconds \nConverting to hours, minutes, seconds....;");
		console.close();
		
		// calculate hours minutes seconds
		hours = seconds/secondsPerHour;
		remainderhrs = seconds%secondsPerHour;
		
		minutes = remainderhrs/secondsPerMin;
		remaindersec = remainderhrs%secondsPerMin;
		
		System.out.println(hours);
		System.out.println(remainderhrs);
		System.out.println(minutes);
		System.out.println(remaindersec);
		
		System.out.println("You have " + hours + " hours, " + minutes + " minutes " + remaindersec + " seconds");
	
	}

}
