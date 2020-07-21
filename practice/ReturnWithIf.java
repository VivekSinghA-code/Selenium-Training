package practice;

public class ReturnWithIf {

	private void greater(int a, int b) {
		
if (a>b) {
	System.out.println("a is greater"+" "+a);
}

else if (b>a) {
	System.out.println("b is greater"+" "+b);
}

else if( a==b) {
	 System.out.println("a and b are equal  "+a+ "\n" +b);
	
}
	}
	
	private String str(String c) {
		
return c;
	}
	
	
	public static void main(String[] args) {
		ReturnWithIf rt= new ReturnWithIf();
		 rt.greater(10, 10);
	String s=	rt.str("Vivek");
		System.err.println(s);

	}

}
