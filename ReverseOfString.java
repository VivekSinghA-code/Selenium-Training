package Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseOfString {

	public static void main(String[] args) {
		
		String test = "feeling good";

		char[] charArray = test.toCharArray();
		
		List<Character> reverse=new ArrayList<Character>();
		 
		for (char c : charArray) {
			
			reverse.add(c);
			
		}
		
		System.out.println("Before reversing"+" "+ reverse);
		
		Collections.reverse(reverse);
		
		System.out.println("After reversing"+" "+reverse);
		
		
		
		
		
		
		
		
		

	}

}
