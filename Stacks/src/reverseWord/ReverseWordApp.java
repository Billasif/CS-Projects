package reverseWord;

import java.util.Scanner;

import stack.StackX;

public class ReverseWordApp {
	
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		String input, output;
		int stackSize;
		StackX<Character> theStack;
		
		System.out.print("Enter a word: ");;
		input = console.next();
		
		stackSize = input.length();
		theStack = new StackX<Character>(stackSize);  // make new stack
		
		//push each character of the word into the stack
		for (int i = 0; i < input.length(); i++)
		{
			char chIn = input.charAt(i);
			theStack.push(chIn);
		}
		 
		output = "";
		//pop off the stack
		while(!theStack.isEmpty())
		{
			char chOut = theStack.pop();
			output += chOut;
		}
		
		System.out.println("Reversed word: " + output);
		
	}

}
