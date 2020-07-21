package practice;

public class digitsOfNumer {

	public static void main(String[] args) {
		int x=123;
		int s=0;
		 
		while (x!=0)
		{
			s=x%10;
			x=x/10;
			System.out.println(s);
		}
		

	}

}
