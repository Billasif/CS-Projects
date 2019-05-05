package bfs_dfs_and_mst_unweighted_undirected;

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