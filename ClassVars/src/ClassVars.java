
public class ClassVars {
	
	// public static class level variable
	public static int x;
	
	public static void fun1(int n){
		int m = 12;
		System.out.println("In fun1");
		System.out.printf("n = %d%n", n);
		
		System.out.printf("m = %d%n", m);
		
		System.out.printf("x = %d%n", x);
		x=22;
		System.out.printf("x = %d%n", x);
		System.out.println("Leaving fun1");
		
	}

	public static void main(String[] args) {
		int n = 15;
		int m = 20;
		x=50;
		
		System.out.println("In main");
		System.out.printf("x = %d%n", x);
		fun1(10);
		System.out.println("Back in main");
		System.out.printf("n = %d%n", n);
		System.out.printf("m = %d%n", m);
		System.out.printf("x = %d%n", x);
	}

}
