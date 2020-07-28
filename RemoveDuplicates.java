package Assignments;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		
		int i=0;
		
		
		String[] split1 = text.split(" ");
		
		
		Set<String> values= new LinkedHashSet<String>();
		
		for (String eachWord : split1) {
			values.add(eachWord);
		}
		System.out.println(values);
		

	}

}
