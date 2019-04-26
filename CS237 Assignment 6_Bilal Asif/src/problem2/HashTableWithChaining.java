/**
 * HashTableWithChaining class
 * 
 * @author Bilal Asif
 * @date 04/25/2019
 *
 * Using trees instead of lists for Hashtable
 */
package problem2;

public class HashTableWithChaining {
	
	   private IntBinarySearchTree[] hashArray;   // array of lists
	   private int arraySize;
	// -------------------------------------------------------------
	   public HashTableWithChaining(int size)        // constructor
	      {
	      arraySize = size;
	      hashArray = new IntBinarySearchTree[arraySize];  // create array
	      for(int j=0; j<arraySize; j++)          // fill array
	         hashArray[j] = new IntBinarySearchTree();     // with lists
	      }
	// -------------------------------------------------------------
	   public void displayTable()
	      {
	      for(int j=0; j<arraySize; j++) // for each cell,
	         {
	         System.out.print(j + ". "); // display cell number
	         hashArray[j].traverse(2);; // display list
	         }
	      }
	// -------------------------------------------------------------
	   public int hashFunc(int key)      // hash function
	      {
	      return key % arraySize;
	      }
	// -------------------------------------------------------------
	   public void insert(int data)  // insert a link
	      {
	     // int key = theLink.getKey();
	      int hashVal = hashFunc(data);   // hash the key
	      hashArray[hashVal].addBST(data);; // insert at hashVal
	      }  // end insert()
	// -------------------------------------------------------------
	   public void delete(int key)       // delete a link
	      {
	      int hashVal = hashFunc(key);   // hash the key
	      hashArray[hashVal].remove(key); // delete link
	      }  // end delete()
	// -------------------------------------------------------------
	   public IntTreeNode find(int key)         // find link
	      {
	      int hashVal = hashFunc(key);   // hash the key
	      IntBinarySearchTree BST = hashArray[hashVal];  // get link
	      return BST.inBST(key);                // return link
	      }
	// -------------------------------------------------------------
} // end class HashTable
