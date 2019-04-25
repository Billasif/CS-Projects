package delimiterMatching;

import java.util.Scanner;

import stack.StackX;

public class BracketsChecker {

static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		String input;
		int stackSize;
		int i;
		StackX<Character> theStack;
		
		System.out.print("Enter a string containing delimiters: ");;
		input = console.next();
		
		stackSize = input.length();
		theStack = new StackX<Character>(stackSize);  // make new stack
		
		for (i = 0; i < input.length(); i++)
		{
			char ch = input.charAt(i);
			//check if the character is an open delimiter,
			//if it is, push it into the stack
			if (ch == '{' || ch == '[' || ch == '(')
				theStack.push(ch);
			else if(ch == '}' || ch == ']' || ch == ')') //if it is a close delimiter, pop and check match
			{
				if(!theStack.isEmpty())
				{
					char chx = theStack.pop();
					if((ch=='{' && chx != '}') || (ch=='[' && chx != ']') || (ch=='(' && chx != ')'))
						break;
						
				}
				else
					break;   //missing open delimiter
				
			}
		}
		 
		if(i == input.length() && theStack.isEmpty())
			System.out.println("The delimiters in the string are matched.");
		else
			System.out.println("The delimiters in the string are NOT matched.");
		
	}

}
