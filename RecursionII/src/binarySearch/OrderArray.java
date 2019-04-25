package binarySearch;

class OrderArray
{
	private long[] a;                 // ref to array a
	private int nElems;               // number of data items
	//-----------------------------------------------------------
	public OrderArray(int max)          // constructor
	{
		a = new long[max];             // create array
		nElems = 0;
	}
	//-----------------------------------------------------------
	public int size()
	{ 	return nElems; 	}
	//-----------------------------------------------------------
	public int find(long searchKey)
	{
		return recFind(searchKey, 0, nElems-1);
	}
	//-----------------------------------------------------------
	private int recFind(long searchKey, int lowerBound,
                                      int upperBound)  //use binary search to find searchKey
   {
		int middle;

		middle = (lowerBound + upperBound ) / 2;
		if(a[middle]==searchKey)
			return middle;              // found it
		else if(lowerBound > upperBound)
			return nElems;             // can't find it
		else                          // divide range
		{
			if(a[middle] < searchKey)   // it's in upper half
				return recFind(searchKey, middle+1, upperBound);
			else                       // it's in lower half
				return recFind(searchKey, lowerBound, middle-1);
		}  // end else divide range
   }  // end recFind()
	//-----------------------------------------------------------
	public void insert(long value)    // put element into array
	{
		int j;
		for(j=0; j<nElems; j++)        // find where it goes
			if(a[j] > value)            // (linear search)
				break;
		for(int k=nElems; k>j; k--)    // move bigger ones up
			a[k] = a[k-1];
		a[j] = value;                  // insert it
		nElems++;                      // increment size
	}  // end insert()
	//-----------------------------------------------------------
	public void display()             // displays array contents
	{
		for(int j=0; j<nElems; j++)       // for each element,
			System.out.print(a[j] + " ");  // display it
		System.out.println("");
	}
	//-----------------------------------------------------------
}  // end of class OrderArray