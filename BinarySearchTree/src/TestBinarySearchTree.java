
public class TestBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntBinarySearchTree myBST = new IntBinarySearchTree();
		
		//Test insert method
		myBST.addBST(35);
		myBST.addBST(18);
		myBST.addBST(9);
		myBST.addBST(24);
		myBST.addBST(20);
		myBST.addBST(64);
		myBST.addBST(86);
		myBST.addBST(41);
		myBST.addBST(30);
		
		//Test traverse method
		myBST.traverse(2);
		
		//Test search method
		myBST.inBST(30).display();
		
		//Test remove method
		if(myBST.remove(18))
		{
			myBST.traverse(2);
		}
		else
		{
			System.out.println("Cannot find the key!");
		}
		
	}

}
