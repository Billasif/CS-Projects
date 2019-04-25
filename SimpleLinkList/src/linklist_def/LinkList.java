package linklist_def;

public class LinkList {
	   private Link first;            // ref to first link on list

	// -------------------------------------------------------------
	   public LinkList()              // constructor
	      {
	      first = null;               // no links on list yet
	      }
	// -------------------------------------------------------------
	   public boolean isEmpty()       // true if list is empty
	      {
	      return (first==null);
	      }
	// -------------------------------------------------------------
	                                  // insert at start of list
	   public void insertFirst(int id, double dd)
	      {                           // make new link
	      Link newLink = new Link(id, dd);
	      newLink.next = first;       // newLink --> old first
	      first = newLink;            // first --> newLink
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
	   public void displayList()
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
} // end of class LinkList
