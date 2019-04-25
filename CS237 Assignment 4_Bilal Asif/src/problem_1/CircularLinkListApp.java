/**
 * CircularLinkListAppApp class
 * 
 * @author Bilal Asif
 * @date 04/04/2019
 *
 */package problem_1;

public class CircularLinkListApp {

	public static void main(String[] args) {
		CircularLinkList myList = new CircularLinkList();
		myList.insert(25.0);
		myList.insert(46.0);
		myList.insert(233.0);
		myList.insert(154.0);
		myList.displayList();
		myList.delete();
		myList.insert(77.0);
		myList.displayList();
		myList.deleteKey(77.0);
		myList.displayList();
		CircularLink find = myList.find(46.0);
		if (find != null) {
			System.out.print("Found");
			find.displayLink();
			System.out.println();
		}
		else
			System.out.println("Not found");
	}

}