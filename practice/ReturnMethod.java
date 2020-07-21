package practice;

public class ReturnMethod {
	
	public String method1(String a, String b) {
		 String c= a+b;
		 
		 return c;

	}
	
	public double method2(double i, int j) {
		 double d= i+j;
		 return d;

	}
	
	
	

	public static void main(String[] args) {
		 ReturnMethod rm= new ReturnMethod();
		System.out.println(rm.method1("Vivek","Singh"));
		System.out.println( rm.method2(10.234, 11));
		
		String[] sarr= {"Sai", "Subiksha"};
		for (int i=0; i< sarr.length;i++)
		{
			System.out.println(sarr[i]);
		}
		 
 for (int i=sarr.length-1; i>=0;i--)
{
	System.out.println(sarr[i]);
}
 
 
 
 
 
 
 
 
 
 
 
 
 
	}
	
}
