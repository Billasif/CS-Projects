import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Numerical_Int {
	public static void main(String[] args) throws IOException {
		FileWriter fileWriter = new FileWriter("Numericalout.txt");
		PrintWriter printWriter = new PrintWriter(fileWriter);
		double du, sum, f = 0;
		int n;
		double w0 = 182.5/60;

		n = 1000;
		du = (Math.PI/2)/n;
		// width of rect
		sum = 0.0;
		for (double k = 0.01; k <= 0.99; k += .01) {
			sum = 0.0;
			for (int i = 0; i <= n - 1; i++) {
				f = (4/w0)*1/(Math.sqrt(1- Math.pow(k, 2)*Math.pow(Math.sin(i *du),2) ) );
				sum += du * f;
				//System.out.println("f = " + f + "\ti = " + i+"\tj = " + j + "\ta+i*dx = " + (a+i*dx));
			}//end of inner for loops
			System.out.println("sum = " + sum +"\tl = " + 2*Math.asin(k));
			printWriter.println(sum + " , " + 2*Math.asin(k));
		}//end of outer for loop
		
		
		System.out.println("Period = " + sum);
		
		printWriter.close();
	}

}
