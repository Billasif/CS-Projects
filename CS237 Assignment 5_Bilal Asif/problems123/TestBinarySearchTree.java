/*
 * TestBinarySearchTree class
 * 
 * @author Bilal Asif
 * @date 04/17/19
 */

package problems123;

public class TestBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntBinarySearchTree myBST = new IntBinarySearchTree();
		
		//Test insert method
		myBST.addBST(50);
		myBST.addBST(70);
		myBST.addBST(30);
		myBST.addBST(80);
		myBST.addBST(34);
		myBST.addBST(32);
		myBST.addBST(9);
		myBST.addBST(47);
		myBST.addBST(18);
		
		//Test traverse method
		myBST.traverse(2);
		
		//Test search method
		myBST.inBST(30).display();
		
		//Test remove method
		if(myBST.remove(19))
		{
			myBST.traverse(2);
		}
		else
		{
			System.out.println("Cannot find the key!");
		}
		
		//testing the added methods
		System.out.println("Calling nodeCount() on this BST returns: " + myBST.nodeCount());
		System.out.println("Calling leavesCount() on this BST returns: " + myBST.leavesCount());
		System.out.println("Calling heightCount() on this BST returns: " + myBST.heightCount());
	}

}
