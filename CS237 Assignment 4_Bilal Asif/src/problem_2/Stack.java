/**
 * Stack class
 * 
 * @author Bilal Asif
 * @date 04/04/2019
 *
 */package problem_2;

import problem_1.CircularLink;
import problem_1.CircularLinkList;

public class Stack {
	private CircularLinkList stack;
	
	public Stack() {
		stack = new CircularLinkList();
	}
	
	public void push(double d) {
		stack.insert(d);
	}
	
	public CircularLink pop() {
		return stack.delete();
	}
	
	public CircularLink peek() {
		return stack.peek();
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}

}
