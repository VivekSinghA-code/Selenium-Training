package week1.day2;

public class BreakContinue {

	public static void main(String[] args) {
		
		for (int i=1; i<=10;i++) {
			if(i==3) {
				System.out.println("three");
				
				//continue;
				break;
			}
			System.out.println(i);
		}
		System.out.println("out of for loop");
	}

	
}
