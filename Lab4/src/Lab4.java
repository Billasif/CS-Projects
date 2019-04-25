import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data;
		final float OutOfPercent = 100;
		final float RadiusOfDiameter = 0.5f;
		final float Pi = 3.14f;
		
		
		Scanner console;
		console = new Scanner(System.in);
		
		System.out.println("Required Format: <type>, <diameter>, <price>, <% dicsount>");
		System.out.print("Enter Pizza Data: ");
		data = console.nextLine();
		
		data = data.replaceAll(" ", "");
		console.close();
		
		// Get the indicies
		int firstIndex = data.indexOf(',');
		int secondIndex = data.indexOf(',', firstIndex+1);
		int thirdIndex = data.indexOf(',', secondIndex+1);
		
		// Get field data
		String field1 = data.substring(0, firstIndex);
		String field2 = data.substring(firstIndex+1, secondIndex);
		String field3 = data.substring(secondIndex+1, thirdIndex);
		String field4 = data.substring(thirdIndex+1, data.length());
		
		// convert field to float
		float diameter;
		float price;
		float percentDiscount;
		field2 = field2.replaceAll("\"", "");
		
		diameter = Float.valueOf(field2);
		System.out.println(diameter);
		
		price = Float.valueOf(field3);
		System.out.println(price);
		
		percentDiscount = Float.valueOf(field4);
		percentDiscount = percentDiscount/OutOfPercent;
		System.out.println(percentDiscount);
		
		// Calculations
		float radius = diameter * RadiusOfDiameter;
		System.out.println(radius);
		
		float Area = Pi * (radius * radius);
		System.out.println(Area);
		
		float PricePerSquareInch = price/Area;
		System.out.println(PricePerSquareInch);
		
		float discountPrice = price - (percentDiscount * price);
		System.out.println(discountPrice);
		
		float discountPricePerSquareInch = discountPrice/Area;
		System.out.println(discountPricePerSquareInch);		
		
		System.out.printf("A " + field1 + " pizza has a diameter of");

	}

}
