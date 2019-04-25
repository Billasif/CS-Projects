import java.util.Scanner;

public class ForLoopStrings {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		String input;
		char letter = 'r';
		int count = 0;
		
		System.out.println("Enter a word");
		input = console.nextLine();
		
		for (int i = 0; i < input.length(); i++){
			if (input.charAt(i) == letter){
				count++;
			}
		}
		System.out.printf("%s appears %d times", letter, count);
		console.close();
	}

}
