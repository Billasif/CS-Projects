/**
 * MSTApp class
 *
 * @author Bilal Asif
 * @date 05/09/2019
 *
 * Driver method which creates a graph of 9 vertices and 12 edges
 */

package problem1;

public class MSTApp {

	public static void main(String[] args) {
		  Graph theGraph = new Graph();
	      theGraph.addVertex('A');    // 0  (start for mst)
	      theGraph.addVertex('B');    // 1
	      theGraph.addVertex('C');    // 2
	      theGraph.addVertex('D');    // 3
	      theGraph.addVertex('E');    // 4
	      theGraph.addVertex('F');	  // 5
	      theGraph.addVertex('G');	  // 6
	      theGraph.addVertex('H');	  // 7
	      theGraph.addVertex('I');	  // 8
	      

	      theGraph.addEdge(0, 1);     // AB
	      theGraph.addEdge(0, 2);     // AC
	      theGraph.addEdge(1, 3);     // BD
	      theGraph.addEdge(2, 4);     // CE
	      theGraph.addEdge(3, 5);  	  // DF
	      theGraph.addEdge(4, 6); 	  // EG
	      theGraph.addEdge(5, 7); 	  // FH
	      theGraph.addEdge(6, 8); 	  // GI
	      theGraph.addEdge(7, 8);     // HI
	      theGraph.addEdge(1, 2);     // BC
	      theGraph.addEdge(3, 4);     // DE
	      theGraph.addEdge(2, 3);     // CD
	      
	      //System.out.print("Minimum spanning tree DFS: ");
	      //theGraph.mst_dfs();             // minimum spanning tree (depth-first)
	      //System.out.println();
	      System.out.print("Mimimum spanning tree BFS: ");
	      theGraph.mst_bfs();
	      System.out.println();

	}

} //end class MSTApp
