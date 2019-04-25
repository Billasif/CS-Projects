/**
 * CircularLink class
 * 
 * @author Bilal Asif
 * @date 04/04/2019
 *
 */package problem_1;



public class CircularLink {
	//without "private" or "public" means the data is package access
		public double dData;
		public CircularLink next;
		
		// -------------------------------------------------------------
		   public CircularLink(double dd) // constructor
		      {
		      dData = dd;                 // initialize data
		      								// ('next' is automatically
		      }                           //  set to null)
		// -------------------------------------------------------------
		   public void displayLink()      // display ourself
		      {
		      System.out.print("{"  + dData + "} ");
		      }

}
