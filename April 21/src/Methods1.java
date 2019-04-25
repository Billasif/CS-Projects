import java.util.Scanner;

public class Methods1 {
	
	public static double calculateAreaOfRectangle(double l, double w){
		double area = l*w;
		return area;
	}
	
	public static float calculateArea(float diameter){
		float radius = diameter/2;
		float area = (float) (Math.PI * radius * radius);
		return area;
	}
	
	public static double calculateCircumference(double radius){
		double c = 2 * Math.PI * radius;
		return c;
	}
	
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		float diameter;
		
		System.out.println("Enter diameter: ");
		diameter = console.nextFloat();
		
		float area = calculateArea(diameter);
		System.out.printf("The area is %f%n", area);
		
		double r = diameter/2;
		double c = calculateCircumference(r);
		System.out.printf("The circumference is %f%n", c);
		
		double a = calculateAreaOfRectangle(2, 3);
		System.out.printf("The Rectangle Area is %f%n", a);
		console.close();
	}


}
