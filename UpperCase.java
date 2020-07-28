package Assignments;

public class UpperCase {

	private static final String Chars = null;

	public static void main(String[] args) {
		
		String test="changeme";
		
	char[] charArray = test.toCharArray();
		
		
		  for (int i=0; i<charArray.length; i++) {
		  	    
		  if (i%2!=0) {
			  
			  System.out.println(Character.toUpperCase(charArray[i]));
		  }else
			  System.out.println(charArray[i]);
		  
		  }
		 
		
		
		
		
		
		
		
		
		
		
		
		

	}

	
}
