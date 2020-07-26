package Bankinformation;

public class AxisBank extends BankInfo {
	

	public void deposit() {
		
		System.out.println("The Method is depositin class Axis bank");
	}
		

	public static void main(String[] args) {
		
		AxisBank ab=new AxisBank();
		ab.deposit();
		ab.saving();
		ab.fixed();
		
		

	}

}
