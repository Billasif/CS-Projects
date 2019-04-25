/*
 * QueueDApp class
 * 
 * Bilal Asif
 * 03/21/2019
 */
package Problem_2;

public class QueueDApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      QueueD<Double> theQueue = new QueueD<Double>(5);  // queue holds 5 items

	      theQueue.insert(10.4);            // insert 4 items
	      theQueue.insert(20.2);
	      theQueue.insert(30.4);
	      theQueue.insert(40.6);

	      theQueue.remove();              // remove 3 items
	      theQueue.remove();              //    (10, 20, 30)
	      theQueue.remove();

	      theQueue.insert(50.5);            // insert 4 more items
	      theQueue.insert(60.2);            //    (wraps around)
	      theQueue.insert(70.1);
	      theQueue.insert(80.8);

	      while( !theQueue.isEmpty() )    // remove and display
	         {                            //    all items
	         Object n = theQueue.remove();  // (40, 50, 60, 70, 80)
	         System.out.print(n);
	         System.out.print(" ");
	         }
	      System.out.println("");

	}

}
