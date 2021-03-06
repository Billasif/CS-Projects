/**
 * Graph class
 *
 * @author Bilal Asif
 * @date 05/09/2019
 *
 * Defining a class that uses adjacency lists and creates a MST of BFS
 */
package problem1;
/*
 * demonstrates depth-first search (DFS), breath-first search (BFS), 
 * 	and minimum spanning tree (MST)
 */
class Graph
{
	private final int MAX_VERTS = 20;
	private Vertex vertexList[]; // list of vertices
	private LinkList2[] adjMat;      // adjacency Linked List
	private int nVerts;          // current number of vertices
	private Stack theStack;
	private Queue theQueue;
//------------------------------------------------------------
	public Graph()               // constructor
	   {
	   vertexList = new Vertex[MAX_VERTS];
	                                       // adjacency matrix
	   adjMat = new LinkList2[MAX_VERTS];
	   nVerts = 0;
	   for(int y=0; y<MAX_VERTS; y++)      // set adjacency
	      //for(int x=0; x<MAX_VERTS; x++)   //    matrix to 0
	         adjMat[y] = new LinkList2();
	   theStack = new Stack();
	   theQueue = new Queue();
	   }  // end constructor
//------------------------------------------------------------
	public void addVertex(char lab)
	   {
	   vertexList[nVerts++] = new Vertex(lab);
	   }
//------------------------------------------------------------
	public void addEdge(int start, int end)
	   {
	   adjMat[start].insertFirst(end);;
	   //adjMat[end][start] = 1;
	   }
//------------------------------------------------------------
	public void displayVertex(int v)
	   {
	   System.out.print(vertexList[v].label);
	   }
//------------------------------------------------------------
	public void dfs()  // depth-first search
	   {                                 // begin at vertex 0
	   vertexList[0].wasVisited = true;  // mark it
	   displayVertex(0);                 // display it
	   theStack.push(0);                 // push it
	
	   while( !theStack.isEmpty() )      // until stack empty,
	      {
	      // get an unvisited vertex adjacent to stack top
	      int v = getAdjUnvisitedVertex( theStack.peek() );
	      if(v == -1)                    // if no such vertex,
	         theStack.pop();
	      else                           // if it exists,
	         {
	         vertexList[v].wasVisited = true;  // mark it
	         displayVertex(v);                 // display it
	         theStack.push(v);                 // push it
	         }
	      }  // end while
	
	   // stack is empty, so we're done
	   for(int j=0; j<nVerts; j++)          // reset flags
	      vertexList[j].wasVisited = false;
	   }  // end dfs
//------------------------------------------------------------
	   public void bfs()                   // breadth-first search
	      {                                // begin at vertex 0
	      vertexList[0].wasVisited = true; // mark it
	      displayVertex(0);                // display it
	      theQueue.insert(0);              // insert at tail
	      int v2;

	      while( !theQueue.isEmpty() )     // until queue empty,
	         {
	         int v1 = theQueue.remove();   // remove vertex at head
	         // until it has no unvisited neighbors
	         while( (v2=getAdjUnvisitedVertex(v1)) != -1 )
	            {                                  // get one,
	            vertexList[v2].wasVisited = true;  // mark it
	            displayVertex(v2);                 // display it
	            theQueue.insert(v2);               // insert it
	            }   // end while
	         }  // end while(queue not empty)

	      // queue is empty, so we're done
	      for(int j=0; j<nVerts; j++)             // reset flags
	         vertexList[j].wasVisited = false;
	      }  // end bfs()
// -------------------------------------------------------------
	   public void mst_dfs()  // minimum spanning tree (depth first)
	   {                                  // start at 0
	      vertexList[0].wasVisited = true;   // mark it
	      theStack.push(0);                  // push it

	      while( !theStack.isEmpty() )       // until stack empty
	         {                               // get stack top
	         int currentVertex = theStack.peek();
	         // get next unvisited neighbor
	         int v = getAdjUnvisitedVertex(currentVertex);
	         if(v == -1)                     // if no more neighbors
	            theStack.pop();              //    pop it away
	         else                            // got a neighbor
	            {
	            vertexList[v].wasVisited = true;  // mark it
	            theStack.push(v);                 // push it
	                                         // display edge
	            displayVertex(currentVertex);     // from currentV
	            displayVertex(v);                 // to v
	            System.out.print(" ");
	            }
	         }  // end while(stack not empty)

	         // stack is empty, so we're done
	         for(int j=0; j<nVerts; j++)          // reset flags
	            vertexList[j].wasVisited = false;
	      }  // end mst_dfs()
//--------------------------------------------------------------
	   public void mst_bfs() //minimum spanning tree (breadth first)
	      {                                // begin at vertex 0
	      vertexList[0].wasVisited = true; // mark it
	      //displayVertex(0);                // display it
	      theQueue.insert(0);              // insert at tail
	      int v2;

	      while( !theQueue.isEmpty() )     // until queue empty,
	         {
	         int v1 = theQueue.remove();   // remove vertex at head
	         // until it has no unvisited neighbors
	         while( (v2=getAdjUnvisitedVertex(v1)) != -1 )
	            {                                  // get one,
	            vertexList[v2].wasVisited = true;  // mark it
	            displayVertex(v1);                 // display it
	            displayVertex(v2);
	            System.out.print(" ");
	            theQueue.insert(v2);               // insert it
	            }   // end while
	         }  // end while(queue not empty)
	      // queue is empty, so we're done
	      for(int j=0; j<nVerts; j++)             // reset flags
	         vertexList[j].wasVisited = false;
	      }  // end mst_bfs()
// -------------------------------------------------------------
// returns an unvisited vertex adj to v
	public int getAdjUnvisitedVertex(int v)
	   {
	   for(int j=0; j<nVerts; j++)
	      if(adjMat[v].find(j)!=null && vertexList[j].wasVisited==false)
	         return j;
	   return -1;
	   }  // end getAdjUnvisitedVertex()
//------------------------------------------------------------
}  // end class Graph

