/**
 * Link class
 * 
 * @author Bilal Asif
 * @date 04/25/2019
 *
 * Link Class for linked lists
 */
package problem2;

public class Link { // (could be other items)
	int iData; // data item
	Link next; // next link in list
//-------------------------------------------------------------

	public Link(int it) // constructor
	{
		iData = it;
	}

//-------------------------------------------------------------
	public int getKey() {
		return iData;
	}

//-------------------------------------------------------------
	public void displayLink() // display this link
	{
		System.out.print(iData + " ");
	}
} // end class Link