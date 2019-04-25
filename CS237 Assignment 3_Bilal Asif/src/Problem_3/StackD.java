/*
 * StackD class
 * 
 * Bilal Asif
 * 03/22/2019
 */
package Problem_3;

import Problem_1.Deque;

public class StackD<T> {
	
	public Deque<T> stk;
	
	public StackD(int s)         // constructor
	   {
	   stk = new Deque<T>(s);  // create new Deque class
	   }
	//--------------------------------------------------------------
	public void push(T j)    // put item on top of stack
	   {
	   stk.insertRight(j);     // using Deque 
	   }
	//--------------------------------------------------------------
	public Object pop()           // take item from top of stack
	   {
	   return stk.removeRight();  // access item, decrement top
	   }
	//--------------------------------------------------------------
	public Object peek()          // peek at top of stack
	   {
	   return stk.peekRight();
	   }
	//--------------------------------------------------------------
	public boolean isEmpty()    // true if stack is empty
	   {
	   return stk.isEmpty();
	   }
	//--------------------------------------------------------------
	public boolean isFull()     // true if stack is full
	   {
	   return stk.isFull();
	   }
	//--------------------------------------------------------------
}  // end class StackD


