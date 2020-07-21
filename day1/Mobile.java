package week1.day1;

public class Mobile {

	String mobileBrand= "MI123";
	int mobileNumber= 1234;
	boolean isUsed= true;
	
	public void makeCall() {
		System.out.println("Make calls");
		long mobileNumber= 123456789l;
		System.out.println(mobileNumber);
	}
	
	public void sendSMS() {
		System.out.println("Send messages");
		System.out.println(mobileBrand);
		
	}
	
	public void takeSnap() {
		System.out.println("Take snap");
	}
	
	public static void main (String []args) {
		Mobile myMobile= new Mobile();
		
		myMobile.makeCall();
		myMobile.sendSMS();
		myMobile.takeSnap();
		System.out.println(myMobile.mobileBrand);
		System.out.println( myMobile.mobileNumber);
		System.out.println(myMobile.isUsed);
		
	}
	
}

