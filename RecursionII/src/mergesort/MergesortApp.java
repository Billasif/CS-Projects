package mergesort;

public class MergesortApp {
	
	public static void main(String[] args)
    {
	    int maxSize = 100;             // array size
	    Mergesort arr = new Mergesort(maxSize);     // create the array
	
	    arr.insert(64);                // insert items
	    arr.insert(21);
	    arr.insert(33);
	    arr.insert(70);
	    arr.insert(12);
	    arr.insert(85);
	    arr.insert(44);
	    arr.insert(3);
	    arr.insert(99);
	    arr.insert(0);
	    arr.insert(108);
	    arr.insert(36);
	
	    arr.display();                 // display items
	
	    arr.mergeSort();               // merge sort the array
	
	    arr.display();                 // display items again
    }  // end main()

}	// end class MergesortApp
