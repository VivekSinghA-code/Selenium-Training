package week1.day2;

public class Calculator {

	public  int sum(int a, int b) {
		
		int c= a+b;
		 return c;
		
	}
	
	public double sub(double d1, double d2) {
		double d3= d1-d2;
		
		return d3;
		

	}
	public static void main(String[] args) {
		 Calculator cal =new Calculator();
		 
		int s1= cal.sum(10,20);
		double s2= cal.sub(20.20, 10.13);
		System.out.println(s1);
		 System.out.println(s2);
		 System.out.println(cal.sum(11, 12));
		 System.out.println(cal.sub(21.01, 15.25));
	}

}
