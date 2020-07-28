package Assignments;

public class Occuranceofe {

	public static void main(String[] args) {
		int i=0;
		String str= "welcome to chennai";
		String replacedString = str.replaceAll(" ", "");
		
		System.out.println(replacedString);
		char[] charArray = replacedString.toCharArray();
		
		
		//int len= charArray.length;
		 //System.out.println(len);
		
		
		  for (char c : charArray) {
			  //System.out.println(c);
			  
			  if (c=='e')
			  {
				  i=i+1;
			  }
			
		}
		    		
		  System.out.println(i);
		
				
	}

}
