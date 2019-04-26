/**
 * IntTreeNode class
 * 
 * @author Bilal Asif
 * @date 04/25/2019
 *
 * importing intTreeNode class
 */
package problem2;

public class IntTreeNode {

	int key; // store this node's key value
	IntTreeNode leftChild; // store the reference
	// to this node's left child
	IntTreeNode rightChild; // store the reference
	// to this node's right child

	// constructor
	public IntTreeNode(int key) {
		this.key = key;
		this.leftChild = null;
		this.rightChild = null;
	}

	public IntTreeNode(int key, IntTreeNode left, IntTreeNode right) {
		this.key = key;
		this.leftChild = left;
		this.rightChild = right;
	}

	// display itself
	public void display() {
		System.out.print("(" + key + ")");
	}

	// remove a node from the subtree
	public IntTreeNode remove(int delKey, IntTreeNode parent) {
		if (delKey < this.key) {

			if (leftChild != null)
				return leftChild.remove(delKey, this);
			else
				return null;
		} else if (delKey > this.key) {

			if (rightChild != null)
				return rightChild.remove(delKey, this);
			else
				return null;
		} else { // find the node

			if (leftChild != null && rightChild != null) {

				IntTreeNode min = rightChild.minRightSubTree();
				this.key = min.key;
				return rightChild.remove(this.key, this);

			} else if (this == parent.leftChild) {
				parent.leftChild = (leftChild != null) ? leftChild : rightChild;
				return this;
			} else if (this == parent.rightChild) {
				parent.rightChild = (leftChild != null) ? leftChild : rightChild;
				return this;
			}
		}

		return null;

	}

	// find a minimum value in the right subtree
	public IntTreeNode minRightSubTree() {
		if (this.leftChild == null)
			return this;
		else
			return leftChild.minRightSubTree();
	}

}
