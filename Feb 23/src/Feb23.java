
public class Feb23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.printf("%-12s%-12s%n", "Header1:", "Header2:");
		
		//System.out.printf("%-12.2f%-12.2f%n%-12.2f%-12.2f", 100.12345, 12.0987334, 1247.38, 23572.327);
		
		//float cost = 12.123f;
		
		//String str;
		
		//str = String.format("The cost is $%.2f,%n", cost);
		//System.out.print(str);
		
		
		String data = "moredata1:12:1.2:done";
		int first = data.indexOf(":");
		int second = data.indexOf(":", first+1);
		int third = data.indexOf(":", second+1);
		
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);

	}

}
