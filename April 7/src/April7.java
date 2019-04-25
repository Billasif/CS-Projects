import java.util.Scanner;

public class April7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner console = new Scanner(System.in);
		String input;
		
		System.out.println("Enter a word");
		input = console.next();
		console.close();
		
		int j = input.length() - 1;
		
		boolean pallendrome = true;
		
		for (int i = 0; i < input.length()/2; i++){
			char ci = input.charAt(i);
			char cj = input.charAt(j);
			
			if (ci != cj){
				pallendrome = false;
				break;
			}
			j--;
			
		}
		
		if (pallendrome){
			System.out.printf("%s is a pallendrome", input);
		}
		else {
			System.out.printf("%s is not a pallendrome", input);
		}
		

	}

}
