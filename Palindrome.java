package Assignments;

public class Palindrome {

	public static void main(String[] args) {

		String str = "Liril";
		String rev = "";

		char[] charArray = str.toCharArray();

		for (int i = charArray.length - 1; i >= 0; i--)
		{

			rev = rev+charArray[i];

		}

		System.out.println(rev);
		if (str.equalsIgnoreCase(rev)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a palindrome");
		}

	}

	private static String charAt(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}























//rev= new StringBuffer(str).reverse().toString();