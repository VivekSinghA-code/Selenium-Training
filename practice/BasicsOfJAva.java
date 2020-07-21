package practice;

public class BasicsOfJAva {

	int sum=90;
	String s1="Hi";
	
	public void method1() {
		int num=10;
		int num2= 20;
		int sum= num+num2;
		System.out.println(sum); //accessing the local variable inside a method
		System.out.println(s1);

	}
	
	public void method2() {
		System.err.println(sum); //accessing the global variable inside a method

	}
	public static void main(String[] args) {
	
BasicsOfJAva boj= new BasicsOfJAva();
boj.method1();
boj.method2();
System.out.println(boj.s1); //accessing the global variable inside a main method using object
System.out.println(boj.method3(5,10)); // parameter passing
boj.array();

Arrays ar= new Arrays();
ar.testName();
	}

	public int method3(int a, int b) { // parameterized method
		int c= a*b;
		return c;
	}
	
	public void array() {
		int[] num= new int[3];
		num[0]=11;
		num[1]=12;
		num[2]=13;
		for (int i=0; i<=num.length-1; i++) {
			System.out.println(num[i]);
		}

	}
	
}

