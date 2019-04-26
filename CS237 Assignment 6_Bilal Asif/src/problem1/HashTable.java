/**
 * HashTable class
 * 
 * @author Bilal Asif
 * @date 04/24/2019
 *
 * It is to define a linear probe hash table that stores strings. 
 */
package problem1;

//The following hash table uses linear probing
public class HashTable {
	private DataItem[] hashArray; // array holds hash table
	private int arraySize;
	private DataItem nonItem; // for deleted items
	// -------------------------------------------------------------

	public HashTable(int size) // constructor
	{
		arraySize = size;
		hashArray = new DataItem[arraySize];
		nonItem = new DataItem("-"); // deleted item key is -
		for (int i = 0; i < size; i++)
			hashArray[i] = new DataItem(nonItem.getKey());
	}

	// -------------------------------------------------------------
	public void displayTable() {
		System.out.print("Table: ");
		for (int j = 0; j < arraySize; j++) {
			if (hashArray[j] != null)
				System.out.print(hashArray[j].getKey() + " ");
			else
				System.out.print("** ");
		}
		System.out.println("");
	}

	// -------------------------------------------------------------
	public int hashFunc(String key) {
		int hashVal = 0;
		for (int i = 0; i < key.length(); i++) {
			int letter = key.charAt(i);
			hashVal = (hashVal * 27 + letter) % arraySize;
		}
		return hashVal; // hash function
	}

	// -------------------------------------------------------------
	public void insert(DataItem item) // insert a DataItem
	// (assumes table not full)
	{
		String key = item.getKey(); // extract key
		int hashVal = hashFunc(key); // hash the key
										// until empty cell or -1,
		while (hashArray[hashVal].getKey() != "-") {
			++hashVal; // go to next cell
			hashVal %= arraySize; // wraparound if necessary
		}
		hashArray[hashVal] = item; // insert item
	} // end insert()
	// -------------------------------------------------------------

	public DataItem delete(String key) // delete a DataItem
	{
		int hashVal = hashFunc(key); // hash the key

		while (hashArray[hashVal].getKey() != "-" && hashArray[hashVal].getKey() != null) // until empty cell,
		{ // found the key?
			if (hashArray[hashVal].getKey().equals(key)) {
				DataItem temp = hashArray[hashVal]; // save item
				hashArray[hashVal] = nonItem; // delete item
				return temp; // return item
			}
			++hashVal; // go to next cell
			hashVal %= arraySize; // wraparound if necessary
		}
		return null; // can't find item
	} // end delete()
	// -------------------------------------------------------------

	public DataItem find(String key) // find item with key
	{
		int hashVal = hashFunc(key); // hash the key

		while (hashArray[hashVal].getKey() != null && hashArray[hashVal].getKey() != "-") // until empty cell,
		{ // found the key?
			if (hashArray[hashVal].getKey().equals(key))
				return hashArray[hashVal]; // yes, return item
			++hashVal; // go to next cell
			hashVal %= arraySize; // wraparound if necessary
		}
		return null; // can't find item
	}
	// -------------------------------------------------------------
} // end class HashTable
