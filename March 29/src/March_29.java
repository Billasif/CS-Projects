

public class March_29 {

	public static void main(String[] args) {
		
		String lastName = "Bob";
		int result;
		
		result = lastName.compareToIgnoreCase("Carswell");
		
		if (result < 0){
			System.out.printf("%s comes before Carswell", lastName);
		}
		
		
		// Cork vs Carswell = 14
		// Carswell vs Carswell = 0
		// Bob vs Carswell = -1
		
		/*
		if lastName <= Cardswell 
				print "you don't have to wait long";
		else if lastName <= Jones
				print "that's not bad";
		else if lastName <= Smith 
				print "looks like a bit of a wait";
		else if lastName <= Young
				print "its gonna be a while"
		else 
				print "bring a book"
		
		*/
	}

}
