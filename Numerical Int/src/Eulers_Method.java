import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Eulers_Method {

	public static void main(String[] args) throws IOException {
		double y0, v0, dt, t;
		double u1o, u2o, u1n, u2n;
		double H = 8000;
		double R = 6370000;
		dt = .05;
		double g = 9.8;
		//y = 0;
		double c = 0.5;
		double m = 70;
		y0 = 32000;
		v0 = 0;
		//double w=0.1;
		FileWriter fileWriter = new FileWriter("Euler.txt");
		PrintWriter printWriter = new PrintWriter(fileWriter);
		
		t = 0;
		//u1n = 0;
		u1o = y0;
		u2o = v0;
		printWriter.println("T\tu1n\tu2n");
		while (u1o > 0) {
			u2n = u2o - (g-((c*Math.pow(u2o, 2))/m))  * dt;
			u1n = u1o + u2n * dt;
			t = t + dt;
			printWriter.println(t + "," + u1n + "," + u2n + "," + g + "," + c);
			u2o = u2n;
			u1o = u1n;
			double a = 1+(u1o/R);
			g = 9.8/Math.pow(a,2);
			c = 0.5*Math.exp(-u1o/H);
			
		}
		
		
		
		printWriter.close();
	}

}
