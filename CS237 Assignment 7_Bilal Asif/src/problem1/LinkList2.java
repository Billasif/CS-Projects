package problem1;

public class LinkList2 {
	private Link first;            // ref to first link on list

	// -------------------------------------------------------------
	   public LinkList2()              // constructor
	      {
	      first = null;               // no links on list yet
	      }
	// -------------------------------------------------------------
	   public boolean isEmpty()       // true if list is empty
	      {
	      return (first==null);
	      }
	// -------------------------------------------------------------
	   public void insertFirst(int id)
	      {                           // make new link
	      Link newLink = new Link(id);
	      newLink.next = first;       // it points to old first link
	      first = newLink;            // now first points to this
	      }
	// -------------------------------------------------------------
	   public Link deleteFirst()      // delete first item
	      {                          
		    if(isEmpty())		//first check whether the list is empty
		    	return null;
		    else
		    {
		     	Link temp = first;          // save reference to link
			   	first = first.next;         // delete it: first-->old next
			   	return temp;                // return deleted link
		    }
	      }
	// -------------------------------------------------------------
	   public Link find(int key)      // find link with given key
	      {                           
		   if(isEmpty())		//first check whether the list is empty
		    	return null;
		    else
		    {
		    	Link current = first;              // start at 'first'
		    	while(current.iData != key)        // while no match,
		    	{
		    		if(current.next == null)        // if end of list,
		    			return null;                 // didn't find it
		    		else                            // not end of list,
		    			current = current.next;      // go to next link
		    	}
		    	return current;                    // found it
		    }
	     }
	// -------------------------------------------------------------
	   public Link delete(int key)    // delete link with given key
	      {                          
		   	if(isEmpty())		//first check whether the list is empty
		    	return null;
		    else
		    {
		    	Link current = first;              // search for link
		    	Link previous = first;
		    	while(current.iData != key)
		    	{
		    		if(current.next == null)
		    			return null;                 // didn't find it
		    		else
		    		{
		    			previous = current;          // go to next link
		    			current = current.next;
		    		}
		    	}                               // found it
		    	if(current == first)               // if first link,
		    		first = first.next;             //    change first
		    	else                               // otherwise,
		    		previous.next = current.next;   //    bypass it
		    	return current;
		    }
	      }
	// -------------------------------------------------------------
	   public void displayList()      // display the list
	      {
	      System.out.print("List (first-->last): ");
	      Link current = first;       // start at beginning of list
	      while(current != null)      // until end of list,
	         {
	         current.displayLink();   // print data
	         current = current.next;  // move to next link
	         }
	      System.out.println("");
	      }

}
