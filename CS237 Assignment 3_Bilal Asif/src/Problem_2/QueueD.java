/*
 * QueueD class
 * 
 * Bilal Asif
 * 03/21/2019
 */
package Problem_2;

import Problem_1.Deque;

public class QueueD<T> {
	private int nItems;
	private Deque<T> que;
	
	   public QueueD(int s)          // constructor
	      {
	      que = new Deque<T>(s);
	      }
	//--------------------------------------------------------------
	   public void insert(T item)   // put item at rear of queue
	      {
		   	que.insertRight(item);
		   	nItems++;
	      }
	//--------------------------------------------------------------
	   public Object remove()         // take item from front of queue
	      {
		   nItems--;
		   return que.removeLeft();	
	      }
	//--------------------------------------------------------------
	   public Object peek()      // peek at front of queue
	      {
		   	return que.peekLeft();
	      }
	//--------------------------------------------------------------
	   public boolean isEmpty()    // true if queue is empty
	      {
		   return que.isEmpty();
	      }
	//--------------------------------------------------------------
	   public boolean isFull()     // true if queue is full
	      {
	      return que.isFull();
	      }
	//--------------------------------------------------------------
	   public int size()           // number of items in queue
	      {
	      return nItems;
	      }
	//--------------------------------------------------------------

}//end of class
