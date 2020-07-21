package practice;

import week1.day1.Factorial;

public class Arrays {

	public void testName() {
		System.out.println("Printing from the other class from the same package");

	}
	 public double add(double a, double b) {
		double c=a+b;
		return c;

	}
	
	 
	public static void main(String[] args) {
		Arrays a=new Arrays();
System.out.println(a.add(10,20));

Factorial ar= new Factorial();
 ar.testName();//Printing from the other class from the other package


	}

	
}
