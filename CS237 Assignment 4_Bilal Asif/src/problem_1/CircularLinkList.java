/**
 * CircularLinkList class
 * 
 * @author Bilal Asif
 * @date 04/04/2019
 *
 */package problem_1;

public class CircularLinkList {
	private CircularLink current;

	private int nItems; // Track items on list
	// -------------------------------------------------------------

	public CircularLinkList()// creat a new Linklist with no nodes and 0 items
	{
		current = null;
		nItems = 0;
	}

	// -------------------------------------------------------------
	public boolean isEmpty()// check if list is empty
	{
		return current == null;
	}

	// -------------------------------------------------------------
	public long getItems()// return how many itmes in list
	{
		return nItems;
	}

	// -------------------------------------------------------------
	public void step() {
		if(current != null) {
			current = current.next;
		}
	}

	// -------------------------------------------------------------
	public void insert(double dd) // inserts new link after current link
	{
		if (isEmpty())// if there are no nodes, put the new link at the start
		{
			current = new CircularLink(dd);
			current.next = current;
		} else// if there are nodes, put the new link after the new node
		{
			CircularLink newLink = new CircularLink(dd);
			CircularLink temp = current.next;
			while(temp.next != current) {
				temp = temp.next;
			}
			newLink.next = current;
			temp.next = newLink;
		}
		nItems++;
	}

	// -------------------------------------------------------------
	public CircularLink find(double dd) {
		for (int i =0; i<nItems; i++) {
			if (current.dData == dd) {
				return current;
			}
			else
				step();
		}
		return null;
	}

	// -------------------------------------------------------------
	public CircularLink delete() {
		if (isEmpty()) {
			System.out.println("List is empty.");
			return null;
		} else if (current.next == current)// if there is only one node
		{
			CircularLink temp = current;// save current as temp
			current = null;
			nItems = 0;
			return temp;

		} else// if more than one node
		{
			CircularLink temp = current;
			CircularLink slast = null;
			while (temp.next != current) {
				slast = temp;
				temp = temp.next;
			}
			slast.next = current;
			nItems--;
			return temp;
		}
	}

	// -------------------------------------------------------------
	public CircularLink peek() {
		return current;
	}

	// -------------------------------------------------------------
	public void displayList() {
		System.out.print("Circular List (current ->): ");
		CircularLink curr = current;
		for (int i = 0; i<nItems; i++) {
			System.out.print(curr.dData + " ");
			curr = curr.next;
		}
		System.out.println("");
	}

	// -------------------------------------------------------------
	public boolean deleteKey(double key) {
		if (current == null)
			return false;
		// if the key is found then delete
		if (current.dData == key) {
			delete();
			return true;
		} else {//if the key isn't the first node, then go through nodes
			CircularLink temp = current, prev = null;
			for (int i = 0; i < nItems; i++) {
				if (temp.dData == key) {
					prev.next = temp.next;
					nItems--;
					return true;
				}
				prev = temp;
				temp = temp.next;
			}
		}
		return false;
	}
}
