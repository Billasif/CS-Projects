/**
 * StackApp class
 * 
 * @author Bilal Asif
 * @date 04/04/2019
 *
 */
package problem_2;

import problem_1.CircularLink;

public class StackApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack mystack = new Stack();
		
		mystack.push(22.0);
		mystack.push(53.0);
		mystack.push(74.0);
		mystack.push(43.0);
		mystack.push(32.0);
		mystack.push(46.0);
		mystack.push(74.0);
		
		while (!mystack.isEmpty()) {
			CircularLink ml = mystack.pop();
			System.out.print(ml.dData);
			System.out.print(" ");
		}

	}

}
