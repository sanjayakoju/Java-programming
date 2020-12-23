package Number;

import java.util.Scanner;

public class PerfectSquare {
	
	static int isPerfectSquare(int n)
	{
		for(int i=1;i<=n+1;i++)
		{
			if(i*i>n)
				return i*i;
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int n =scan.nextInt();
		System.out.println("ans "+isPerfectSquare(n));
	}

}
