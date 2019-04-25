/**
 * Problem3 class: Finding median without sorting
 * 
 * @Bilal Asif
 * @03/05/2019 
 *
 */
public class problem3 {
	
	private long[] theArray;          // ref to array theArray
	   private int nElems;               // number of data items
	//--------------------------------------------------------------
	   public problem3(int max)          // constructor
	      {
	      theArray = new long[max];      // create the array
	      nElems = 0;                    // no items yet
	      }
	//--------------------------------------------------------------
	   public void insert(long value)    // put element into array
	      {
	      theArray[nElems] = value;      // insert it
	      nElems++;                      // increment size
	      }
	//--------------------------------------------------------------
	   public int size()                 // return number of items
	      { return nElems; }
	//--------------------------------------------------------------
	   public void display()             // displays array contents
	      {
	      System.out.print("A=");
	      for(int j=0; j<nElems; j++)    // for each element,
	         System.out.print(theArray[j] + " ");  // display it
	      System.out.println("");
	      }
	//--------------------------------------------------------------
	   public void Median(int left, int right) {//median method calling the left and right index
		   int medianindex = nElems/2;//Defining what the median index is for an even number array
		   
		   int begin = 0;//start index
		   int end = nElems-1;//end index
		   
		   int pivotIndex = partitionIt (left, right, theArray[right]);//Calling partionIt to find the pivotindex
		   
		   if (pivotIndex == medianindex) {//Base case
			   System.out.println("Median is : " + theArray[pivotIndex]);
			   return;
		   }
		   else if (pivotIndex > medianindex) {//Will keep calling itself it will now partiton left part of array
			   Median(begin, pivotIndex -1);
		   }
		   else if (pivotIndex < medianindex) {//will partition right half of array
			   Median(pivotIndex+1, end);
		   }
	   }
	//--------------------------------------------------------------
	    public int partitionIt(int left, int right, long pivot)
	       {
	       int leftPtr = left - 1;           // right of first elem
	       int rightPtr = right + 1;         // left of pivot
	       while(true)
	          {
	          while(leftPtr < right &&       // find bigger item
	                theArray[++leftPtr] < pivot)
	             ;  // (nop)

	          while(rightPtr > left &&       // find smaller item
	                theArray[--rightPtr] > pivot)
	             ;  // (nop)
	          if(leftPtr >= rightPtr)        // if pointers cross,
	             break;                      //    partition done
	          else                           // not crossed, so
	             swap(leftPtr, rightPtr);    //    swap elements
	          }  // end while(true)
	       return leftPtr;                   // return partition
	       }  // end partitionIt()
	//--------------------------------------------------------------
	   public void swap(int dex1, int dex2)  // swap two elements
	      {
	      long temp;
	      temp = theArray[dex1];             // A into temp
	      theArray[dex1] = theArray[dex2];   // B into A
	      theArray[dex2] = temp;             // temp into B
	      }  // end swap()
	//--------------------------------------------------------------

	   public static void main(String[] args) {
		    int maxSize = 16;             // array size
		    problem3 arr;                 // reference to array
		    arr = new problem3(maxSize);  // create the array

		    for(int j=0; j<maxSize; j++)  // fill array with
		       {                          // random numbers
		       long n = (int)(java.lang.Math.random()*199);
		       arr.insert(n);
		       }
		    arr.display();                // display unsorted array

		    long pivot = 99;              // pivot value
		    System.out.print("Pivot is " + pivot);
		    int size = arr.size();
		                                  // partition array
		    int partDex = arr.partitionIt(0, size-1, pivot);

		    System.out.println(", Partition is at index " + partDex);
		    arr.display();                // display partitioned array 
		    
		    arr.Median(0, size-1);//calling methid from main
	   }
}


