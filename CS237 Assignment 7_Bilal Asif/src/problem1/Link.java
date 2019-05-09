/**
 * Link class
 *
 * @author Bilal Asif
 * @date 05/09/2019
 *
 * Creates Link
 */
package problem1;

public class Link {
	
	//without "private" or "public" means the data is package access
	int iData;
	//double dData;
	Link next;
	// -------------------------------------------------------------
	   public Link(int id) // constructor
	      {
	      iData = id;                 // initialize data
	      //dData = dd;                 // ('next' is automatically
	      }                           //  set to null)
	// -------------------------------------------------------------
	   public void displayLink()      // display ourself
	      {
	      System.out.print("{" + iData + "} ");
	      }

} //end of class Link