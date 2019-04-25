import java.util.Scanner;

public class Feb25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data;
		Scanner console;
		
		console = new Scanner(System.in);
		
		System.out.println("Enter Data: ");
		System.out.println("[Size], [Diameter], [Price], [Discount]");
		data = console.nextLine();
		
		
		data = data.replaceAll(" ", "");
		System.out.println(data);
		
		console.close();
		
		// get the indices
		int firstIndex = data.indexOf(',');
		int secondIndex = data.indexOf(',', firstIndex+1);
		int thirdIndex = data.indexOf(',', secondIndex+1);
		
		
		// Get field data
		String field1 = data.substring(0, firstIndex);
		String field2 = data.substring(firstIndex+1, secondIndex);
		String field3 = data.substring(secondIndex+1, thirdIndex);
		String field4 = data.substring(thirdIndex+1, data.length());
		
		System.out.println(field1);
		System.out.println(field2);
		System.out.println(field3);
		System.out.println(field4);
		
		// convert field to float
		float diameter;
		field2 = field2.replaceAll("\"", "");
		System.out.println(field2);
		
		diameter = Float.valueOf(field2);
		
		System.out.println(diameter);
		// Finish calculations for cost and percent discount

	}

}
