package linklist;

public class Link {
	   long dData;             // data item
	   Link next;              // next link in list
	// -------------------------------------------------------------
	   public Link(long dd)           // constructor
	      { dData = dd; }
	// -------------------------------------------------------------
	   public void displayLink()      // display ourself
	      { System.out.print(dData + " "); }
}
