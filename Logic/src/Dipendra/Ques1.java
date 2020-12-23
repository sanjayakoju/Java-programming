package Dipendra;

import java.util.Scanner;

public class Ques1 {
	
	static int sum(int num)
	{
		String st=String.valueOf(num);
		char[] digit=st.toCharArray();
		int sum=0;
		int digits[]=new int[digit.length];
		for(int i=0;i<digit.length;i++)
		{
			char c=digit[i];
			digits[i]=c-48;
			System.out.println("Char "+c);
		}
//	    int[]digits = Integer.toString(num).chars().map(c -> c-'0').toArray();  
//		int digits[]= {1,2,3};
	    for(int d : digits)
	        System.out.println(d); 
	    
			for(int i=0;i<digits.length;i++)
			{
				if(i==digits.length-1)
				{
					sum =sum+ (int)Math.pow(digits[i], digits[0]);
				}
				else
				{
					sum=sum+(int)Math.pow(digits[i],digits[i+1]);
					
				}
					
				
			}
			System.out.println(sum);
		
		return sum;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Integer");
		int a=scan.nextInt();
		sum(a);
	}
}
