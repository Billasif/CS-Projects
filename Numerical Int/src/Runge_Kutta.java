import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Runge_Kutta {

	public static void main(String[] args) throws IOException {
		double w0, dt, L0, L1, L2, L3, L4, K0, K1, K2, K3, K4;
		double yn, vn, t;
		double gamma = 0.000932;
		
		w0 = 182.5;
		L0 = 0;
		dt = 0.0001;
		K0 = 3.14;
		t = 0;
		
		FileWriter fileWriter = new FileWriter("Runge_Kutta.txt");
		PrintWriter printWriter = new PrintWriter(fileWriter);

		for (int i = 0; i < 8000; i++) {
			L1 = (-1) * (Math.pow(w0, 2) * Math.sin(K0) - gamma * L0 ) * dt;
			K1 = (L0) * dt;

			L2 = (-1) * Math.pow(w0, 2) * Math.sin(K0 + K1 / 2) * dt;
			K2 = (L0 + L1 / 2) * dt;

			L3 = (-1) * Math.pow(w0, 2) * Math.sin(K0 + K2 / 2) * dt;
			K3 = (L0 + L2 / 2) * dt;

			L4 = (-1) * Math.pow(w0, 2) * Math.sin(K0 + K3) * dt;
			K4 = (L0 + L3) * dt;

			yn = K0 + (K1 + 2*K2 + 2*K3 + K4) / 6;
			vn = L0 + (L1 + 2*L2 + 2*L3 + L4) / 6;
			t = t + dt;
			// Print
			printWriter.println("t = " + t + "\tyn = " + yn + "\tvn = " + vn);
			K0 = yn;
			L0 = vn;

		}//end of for
		printWriter.close();
	}//end of main
}//end of class