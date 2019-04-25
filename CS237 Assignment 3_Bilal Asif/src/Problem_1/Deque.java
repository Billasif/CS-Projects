/*
 * Deque class
 * 
 * Bilal Asif
 * 03/14/2019
 */
package Problem_1;

public class Deque<T> {
	private int maxSize;
	private T[] deque;
	private int nElems;
	private int left, right;
	
	@SuppressWarnings("unchecked")
	public Deque(int maxSize) {
		this.maxSize = maxSize;//Creating an ojbect of maxSize
		deque = (T[])new Object[this.maxSize];
		left = maxSize/2;
		right = maxSize/2 - 1;
	}//constructor
	
	public void insertLeft(T a) {//Inserting objects into left
		//if the queue isn't full, it'll subtract the left pointer and add an item to it
		//if the left is less than 0, left will wrap around to maxSize-1
		
		if (!isFull()) {
			left--;
			if (left < 0) {
				left = maxSize -1;
			}//end of left <0
			deque[left] = a;
			nElems++;
		}//end if isfull
		else
			System.out.println("The queue is Full");
	}//end of insertLeft

	
	public void insertRight(T a) {//Same thing as insertLeft but on the right side
		//Wrap around is a bit different due to the way you are going
		if (!isFull()) {
			right ++;
			if (right >= maxSize) {
				right = 0;
			}//end of right > maxSize
			deque[right] = a;
			nElems++;
		}//end of isFull
		else 
			System.out.println("The queue is Full");
	}//end of insertRight
	
	public T removeLeft() {
		//removing from the left.  
		if (!isEmpty()) {
			T temp = deque[left];//Storing the variable being removed
			left++;
			if (left >= maxSize) {//seeing if left needs to be wrapped around
				left = 0;
			}//end of left>maxSize
			nElems--;
			return temp;
		}//end of isEmpty
		else
			System.out.println("The queue is Empty");
			return null;
	}//end of removeLeft
	
	public T removeRight() {//same as removeLeft but in the opposite direction
		if (!isEmpty()) {
			T temp = deque[right];
			right --;
			if (right < 0) {
				right = maxSize -1;
			}//end of left>maxSize
			nElems--;
			return temp;
		}//end of isEmpty
		else
			System.out.println("The queue is Empty");
			return null;
	}//end of removeLeft
	
	public T peekLeft() {
		return deque[left];
	}
	
	public T peekRight() {
		return deque[right];
	}
	
	public boolean isEmpty() {//checks if the queue is empty.
		if (nElems == 0)
			return true;
		else 
			return false;
		// TODO Auto-generated method stub
		
	}//end of isEmpty method

	public boolean isFull() {//Checks if the queue is full
		if (nElems == maxSize)
			return true;
		else
			return false;
		// TODO Auto-generated method stub
	}//end of isFull method
	

}
