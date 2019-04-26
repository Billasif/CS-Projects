/**
 * DataItem String class
 * 
 * @author Bilal Asif
 * @date 04/24/2019
 *
 * A dataitem class with string
 */
package problem1;

public class DataItem
{                                // (could have more data)
	private String iData;               // data item (key)
	//--------------------------------------------------------------
	public DataItem(String ii)          // constructor
	   { iData = ii; }
	//--------------------------------------------------------------
	public String getKey()
	   { return iData; }
	//--------------------------------------------------------------
}  // end class DataItem
