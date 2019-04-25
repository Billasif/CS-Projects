
public class March_31 {

	public static void main(String[] args) {
		
		
		/*int n1 = 1;
		int n2 = 2;
		int sum = 0;
		int count = 0;
		
		while (count < 4){
			sum = n1 + n2;
			n1 = n2;
			n2 = sum;
			count ++;
			
			System.out.println(sum + " ");
		}
		*/
		
		int n = 971;
		
		while (n != 1){
			if (n % 2 == 0){
				// n /= 2 is n = n/2
				n /= 2; 
			}
			else {
				n = 3*n + 1;
			}
			System.out.println(n + " ");
		}
		
	}

}
