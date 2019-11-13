import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Eulers_Method {

	public static void main(String[] args) throws IOException {
		double y0, v0, dt, t, m;
		double u1o, u2o, u1n, u2n;
		dt = .05;
		double g = 1;
		//y = 0;
		double R = 1;
		double M = 1;
		m = 0.7;
		y0 = 0;
		v0 = 0;
		//double w=0.1;
		FileWriter fileWriter = new FileWriter("Euler.txt");
		PrintWriter printWriter = new PrintWriter(fileWriter);
		
		t = 0;
		//u1n = 0;
		u1o = y0;
		u2o = v0;
		printWriter.println("T\tu1n\tu2n");
		while (t > 20) {
			u2n = u2o - (m*g-M*g*Math.sin(u1o))/((m+M)*R)  * dt;
			u1n = u1o + u2n * dt;
			t = t + dt;
			printWriter.println(t + "," + u1n + "," + u2n);
			u2o = u2n;
			u1o = u1n;
			
		}
		
		
		
		printWriter.close();
	}

}
