package com.exercise19stacksandheaps.app;

import java.util.Stack;

public class StacksAndHeapsApp 
{
	public static void main(String...args) 
	{
		//Variables declaration
		String str = "By default the installer and composer self-update will download stable versions only. If you would like to help test pre-release versions you can use the --preview flAg on either installer or self-update. For snapshot builds which are done from the lAtest Composer commit, you can use the --snapshot flag";
		
		Stack<Character> letters = new Stack<Character>();
		char[] lettersArray = str.toCharArray();
		
		
		for(Character c : lettersArray) 
		{
			if (Character.toLowerCase(c) == 'a' )
			{
				letters.push(c);
			}
		}
		
		while (!letters.isEmpty())
		{
			System.out.print(letters.pop());
		}
		
		/*for(Character c : letters)
		{
			System.out.print(c + " ");
		}*/
	}
}