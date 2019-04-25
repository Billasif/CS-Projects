package towerOfHanoi;

//solves Towers of Hanoi puzzle

public class TowerOfHanoi {
	
	   static int nDisks = 4;

	   public static void main(String[] args)
	      {
	      doTowers(nDisks, 'A', 'C', 'B');
	      }
	   //-----------------------------------------------------------
	   public static void doTowers(int n, char src, char dest, char inter)
	      {
		   	if(n==1)
		   		System.out.println("Disk 1 from " + src + " to "+ dest);
		   	else
		   	{
		   		doTowers(n-1, src, inter, dest);   // src to inter

		   		System.out.println("Disk " + n +   // move bottom
	                            " from " + src + " to "+ dest);
		   		doTowers(n-1, inter, dest, src);   // inter to dest
	         }
	      }
	//-------------------------------------------------------------

}
