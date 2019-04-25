package linklist_def;

public class Link {
	
	//without "private" or "public" means the data is package access
	int iData;
	double dData;
	Link next;
	// -------------------------------------------------------------
	   public Link(int id, double dd) // constructor
	      {
	      iData = id;                 // initialize data
	      dData = dd;                 // ('next' is automatically
	      }                           //  set to null)
	// -------------------------------------------------------------
	   public void displayLink()      // display ourself
	      {
	      System.out.print("{" + iData + ", " + dData + "} ");
	      }

} //end of class Link
