package week1.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		
		int[] num= {10,20,30,15,25};
		
		Arrays.sort(num);
		for(int i=0; i<=num.length-1;i++)
		{ 
			System.out.println(num[i]);
		}
		
		//reverse sorting
		for (int i=num.length-1; i>=0;i--)
		{
			System.out.println(num[i]);
		}
		
		
	//double[] d1= {1.001, 2.002, 3.003};
	
	double[] d1= {10.001,12.22,13.88};
	
	for(int j=0; j<=d1.length-1;j++)
	{ 
		
		System.out.println(d1[j]);
	}
	}
