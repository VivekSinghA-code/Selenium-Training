
public class MethodOverriding {

	public int add(int a, int b) {
		int c = a + b;
		return c;

	}

	public int add(int a, int b, int c) {
		int d = a + b + c;

		return d;
	}

	public int multiply(int a, int b) {

		int c = a * b;
		return c;
	}

	public double multiply(int a, double b) {
		double c = a * b;
		return c;
	}

	public int divide(int a, int b) {
		int c = a / b;
		return c;

	}

	public double divide(int a, double b) {
		double c = b / a;
		return c;

	}

	public static void main(String[] args) {
		MethodOverriding mo = new MethodOverriding();
		int s1 = mo.add(10, 20);
		System.out.println(s1);
		int s2 = mo.add(10, 20, 30);
		System.out.println(s2);

		int m1 = mo.multiply(10, 9);
		System.out.println(m1);
		double m2 = mo.multiply(2, 10.234);
		System.out.println(m2);

		int d1 = mo.divide(20, 10);
		System.out.println(d1);
		double d2 = mo.divide(6, 20.123);
		System.out.println(d2);

	}

}
