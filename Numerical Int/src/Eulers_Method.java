import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Eulers_Method {

	public static void main(String[] args) throws IOException {
		double y0, v0, dt, t;
		double u1o, u2o, u1n, u2n;
		double w0;
		
		w0 = 182.5;
		dt = .001;
		double gamma = -0.000932;
		//y = 0;
		
		y0 = 3.14;
		v0 = 0;
		//double w=0.1;
		FileWriter fileWriter = new FileWriter("Euler.txt");
		PrintWriter printWriter = new PrintWriter(fileWriter);
		
		t = 0;
		//u1n = 0;
		u1o = y0;
		u2o = v0;
		printWriter.println("T\tu1n\tu2n");
		for (int i = 0; i < 28800 ; i++) {
			u2n = u2o - (Math.pow(w0, 2) * Math.sin(u1o) - gamma * u2o)  * dt;
			u1n = u1o + u2n * dt;
			t = t + dt;
			printWriter.println(t + "," + u1n + "," + u2n);
			u2o = u2n;
			u1o = u1n;
		}
		
		
		
		printWriter.close();
	}

}
