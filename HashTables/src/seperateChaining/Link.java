package seperateChaining;

public class Link
{                                   // (could be other items)
	int iData;                  // data item
	Link next;                   // next link in list
	//-------------------------------------------------------------
	public Link(int it)                 // constructor
	   { iData= it; }
	//-------------------------------------------------------------
	public int getKey()
	   { return iData; }
	//-------------------------------------------------------------
	public void displayLink()           // display this link
	   { System.out.print(iData + " "); }
}  // end class Link
