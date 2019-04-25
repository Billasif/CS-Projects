package quicksort;

public class QuickSort1App {
	public static void main(String[] args)
    {
    int maxSize = 16;             // array size
    QuickSort1 arr;
    arr = new QuickSort1(maxSize);  // create array

    for(int j=0; j<maxSize; j++)  // fill array with
       {                          // random numbers
       long n = (int)(java.lang.Math.random()*99);
       arr.insert(n);
       }
    arr.display();                // display items
    arr.quickSort();              // quicksort them
    arr.display();                // display them again
    }  // end main()
} // end class QuickSort1App
