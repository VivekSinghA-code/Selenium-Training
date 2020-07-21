package optioinalAssignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int range=10;
		int firstNum=0;
		int secNum=1;
		int sum;
		 
		for (int i=0; i<=range; i++) {
			System.out.println(firstNum);
		     sum = firstNum + secNum;
			firstNum=secNum;
			secNum=sum;
			
			
		}

	}

}
