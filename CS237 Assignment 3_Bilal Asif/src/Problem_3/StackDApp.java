/*
 * StackDApp class
 * 
 * Bilal Asif
 * 03/22/2019
 */
package Problem_3;

public class StackDApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackD<Double> stk = new StackD<Double>(5);
		
		stk.push(12.4);
		stk.push(8.1);
		stk.push(3.1415);//Adding items into Stack
		stk.push(6.8835);
		System.out.println(stk.peek());//Peaking at item on top
		stk.push(9324.1);//adding another item into stack
		
		while (!stk.isEmpty()) {//Popping all items until stack is empty
			Object n = stk.pop();
			System.out.println(n);
		}

	}

}
