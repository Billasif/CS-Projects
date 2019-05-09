/**
 * Vertex class
 *
 * @author Bilal Asif
 * @date 05/09/2019
 *
 * Creates a Vertex
 */
package problem1;

class Vertex
{
	public char label;        // label (e.g. 'A')
	public boolean wasVisited;
	//------------------------------------------------------------
	public Vertex(char lab)   // constructor
	   {
	   label = lab;
	   wasVisited = false;
	   }
	//------------------------------------------------------------
}  // end class Vertex