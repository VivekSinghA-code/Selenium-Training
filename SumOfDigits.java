package Assignments;

public class SumOfDigits {

	public static void main(String[] args) {
		
		String text = "Tes12Le79af65";
		 int sum=0;
	String 	text2= text.replaceAll("[a-zA-z]","");
		
		System.out.println(text2);
		
		char[] charArray = text2.toCharArray();
		
		
		  for (int i=0; i <charArray.length;i++) {
			  
			  String strNum = charArray[i]+"";
			  int num = Integer.parseInt(strNum);
			  
			  sum=sum+num;
		   }
		  
		  System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}

}
