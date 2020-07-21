package practice;

public class Strings {

	public String string1(String a) {
		
return a;
	}
	
	public static void main(String[] args) {
		String[] name= {"Vivek","Singh","Sai"};
		for (int i=0; i<=name.length-1;i++) {
			System.out.println(name[i]);
		
		//for (int i= name.length-1;i>=0;i--) {
			//System.out.println(name[i]);
		}

		int a= 100; 
		Strings s= new Strings();
		System.err.println(s.string1("Hello World"+" "+  a));
		
	}

}
