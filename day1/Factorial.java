package week1.day1;

import org.testng.annotations.Test;

public class Factorial {

	
	public void testName() {
		System.out.println("Printingfrom other package");
	}
	public static void main(String[] args) 
	{
		
	int x=5;
	int a = 1;
	int i=1;
	 while (i<=x)
	 {
		 a = a * i;
		 i=i+1;
	 }
		 System.out.println(a); 
	 
	 }
	}
	