package week1.day1;

public class SumOfDigits {

	public static void main(String[] args) {
		int s= 0;
		int x=123;
			
		while(x!=0) {
			s=s+x%10;
			x=x/10;
		}
			
			System.out.println(s);
	
	}
}

