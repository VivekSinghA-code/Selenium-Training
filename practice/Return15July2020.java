package practice;

public class Return15July2020 {

	
	public byte num () {
		return 20;
		
	}
	
	public int num1() {
		return 10;
	}
	
	public void tst() {
		System.out.println("test");

	}
	
	
	
	public static void main(String[] args) {
		Return15July2020 rt= new Return15July2020();
		System.out.println(rt. num());
		int i= rt.num1();//short cut to create a variable is ctrl,2+l
		System.out.println(i);
		rt.tst();// void does not return the value 

	}

}
