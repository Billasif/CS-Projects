
public class IntBinarySearchTree {
	
	private IntTreeNode root;  //first node of the tree
	private int numItems;     //number of nodes in the tree

	//constructor
	public IntBinarySearchTree()
	{
		root = null;
		numItems = 0;
	}
	
	//getters
	public IntTreeNode getRoot() {
		return root;
	}


	public int getNumItems() {
		return numItems;
	}


	//check whether this binary tree is a binary search tree
	public boolean isBST()
	{
		return isBST(root);
	}
	
	//helper method: recursive check isBST
	private boolean isBST(IntTreeNode root)
	{
		if(root == null)
			return true;
		if(  isSubTreeLess(root.leftChild, root.key) &&
			      isSubTreeGreater(root.rightChild, root.key) &&
                  isBST (root.leftChild) &&
                  isBST (root.rightChild)  )
			return true;
		else
			return false;
	}
	
	//helper for isBST(IntTreeNode)
	private boolean isSubTreeLess(IntTreeNode subRoot, int value)
	{
		if(subRoot == null)
			return true;
		if(subRoot.key < value && 
				isSubTreeLess(subRoot.leftChild, value) &&
				isSubTreeLess(subRoot.rightChild, value))
			return true;
		else
			return false;
	}
	
	//helper for isBST(IntTreeNode)
	private boolean isSubTreeGreater(IntTreeNode subRoot, int value)
	{
		if(subRoot == null)
			return true;
		if(subRoot.key >= value && 
				isSubTreeGreater(subRoot.leftChild, value) &&
				isSubTreeGreater(subRoot.rightChild, value))
			return true;
		else
			return false;
	}
	
	//insert a node into this binary search tree
	public void addBST(int newKey)
	{
		root = addBST(newKey, root);
		numItems++;
	}
	
	//helper method: recursive insert
	private IntTreeNode addBST(int newKey, IntTreeNode subTreeRoot)
	{
		if (subTreeRoot==null)
		{
			//create a new node
			subTreeRoot = new IntTreeNode(newKey);
		}
		else if (newKey < subTreeRoot.key)
			subTreeRoot.leftChild = addBST(newKey, subTreeRoot.leftChild);
		else
			subTreeRoot.rightChild = addBST(newKey, subTreeRoot.rightChild);
			
		return subTreeRoot;
	}
	
	//search a node in this binary search tree
	public IntTreeNode inBST(int searchKey)
	{
		return inBST(searchKey, root);
	}
	
	//helper method: recursive search
	private IntTreeNode inBST(int searchKey, IntTreeNode subTreeRoot) 
	{
		if (subTreeRoot == null)
		{
			return null;
		}
		else
		{
			if (searchKey == subTreeRoot.key)
				return subTreeRoot;
			else if (searchKey < subTreeRoot.key)
			{
				return inBST(searchKey, subTreeRoot.leftChild);
			}
			else
			{
				return inBST(searchKey, subTreeRoot.rightChild);
			}
		}
	}
	
	//traverse this binary search tree in different ways
	public void traverse(int traverseType)
    {
		switch(traverseType)
	       {
	       case 1: System.out.print("\nPreorder traversal: ");
	               preOrder(root);
	               break;
	       case 2: System.out.print("\nInorder traversal:  ");
	               inOrder(root);
	               break;
	       case 3: System.out.print("\nPostorder traversal: ");
	               postOrder(root);
	               break;
	       }
		System.out.println();
    }
	
	//helper method: recursive preorder traverse
	 private void preOrder(IntTreeNode subTreeRoot)
     {
	      if(subTreeRoot != null)
	        {
	    	  subTreeRoot.display();
	    	  preOrder(subTreeRoot.leftChild);
	    	  preOrder(subTreeRoot.rightChild);
	        }
      }
	
	//helper method: recursive inorder traverse
      private void inOrder(IntTreeNode subTreeRoot)
	  {
	      if(subTreeRoot != null)
	       {
	         inOrder(subTreeRoot.leftChild);
	         subTreeRoot.display();
	         inOrder(subTreeRoot.rightChild);
	       }
      }

    //helper method: recursive postorder traverse
	  private void postOrder(IntTreeNode subTreeRoot)
	  {
	      if(subTreeRoot != null)
	       {
	         postOrder(subTreeRoot.leftChild);
	         postOrder(subTreeRoot.rightChild);
	         subTreeRoot.display();
	       }
      }
	  
	  //remove a node from this binary search tree
	  public boolean remove(int delKey)
	  {
		  if (root == null)
			return false;
		  else {
				 if (delKey == root.key) {
					IntTreeNode auxRoot = new IntTreeNode(0); //dummy root
					auxRoot.leftChild = root;
					IntTreeNode removedNode = root.remove(delKey, auxRoot);
					root = auxRoot.leftChild;
					if (removedNode != null) {
						removedNode = null;
						numItems--;
						return true;
					}
					else
						return false;
				}
				else {
					IntTreeNode removedNode = root.remove(delKey, null);
					if (removedNode != null) {
						removedNode = null;
						numItems--;
						return true;
					}
					else
					return false;
				}
			}
	}
		
}
