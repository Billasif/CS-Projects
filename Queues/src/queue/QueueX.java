package queue;

public class QueueX<T> {
	   private int maxSize;
	   private T[] queArray;
	   private int front;     //front of the queue
	   private int rear;      //rear of the queue
	   private int nItems;
	//--------------------------------------------------------------
	   @SuppressWarnings("unchecked")
	public QueueX(int s)          // constructor
	      {
	      maxSize = s;
	      queArray = (T[])new Object[maxSize];
	      front = 0;
	      rear = -1;
	      nItems = 0;
	      }
	//--------------------------------------------------------------
	   public void insert(T item)   // put item at rear of queue
	      {
		   	if(rear == maxSize-1)         // deal with wraparound
		   			rear = -1;
		   	queArray[++rear] = item;         // increment rear and insert
		   	nItems++;                     // one more item
	      }
	//--------------------------------------------------------------
	   public T remove()         // take item from front of queue
	      {
		   	T temp = queArray[front++]; // get value and increment front
		   	if(front == maxSize)           // deal with wraparound
		   		front = 0;
		   	nItems--;                      // one less item
		   	return temp;
	      }
	//--------------------------------------------------------------
	   public T peek()      // peek at front of queue
	      {
		   	return queArray[front];
	      }
	//--------------------------------------------------------------
	   public boolean isEmpty()    // true if queue is empty
	      {
		   return (nItems==0);
	      }
	//--------------------------------------------------------------
	   public boolean isFull()     // true if queue is full
	      {
	      return (nItems==maxSize);
	      }
	//--------------------------------------------------------------
	   public int size()           // number of items in queue
	      {
	      return nItems;
	      }
	//--------------------------------------------------------------
	  }  // end class QueueX