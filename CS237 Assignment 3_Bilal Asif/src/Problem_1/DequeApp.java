package Problem_1;

public class DequeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Double> deq = new Deque<Double>(4);
		
		deq.insertLeft(14.1);//Inserting left
		deq.insertLeft(9.4);//Inserting right
		deq.insertRight(15.2);
		deq.insertRight(10.9);
		System.out.println(deq.peekLeft());//Checking value on left
		System.out.println(deq.peekRight());//checking value on right
		while (!deq.isEmpty()) {//removing all values from the left side going around
			double n = deq.removeLeft();
			System.out.println(n);
		}

	}

}
