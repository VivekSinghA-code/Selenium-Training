package optioinalAssignment;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n=153;
		int c=0,a;
		
		while (n>0) {
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
		System.out.println(c);
		
if (c==153) 
	System.out.println("Amstrong number");

else 
	System.out.println("Not amstrong number");

	}


}