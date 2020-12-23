package Number;

import java.util.Scanner;

public class UpCount {

	static int nUpCount(int a[], int n)
	{
		int sum=0;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			if(sum>n)
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner scans = new Scanner(System.in);
		int a[]= {1,2,3,4,-5,6,7};
		System.out.println("Enter the value of n");
		int n = scans.nextInt();
		System.out.println("Upcount = "+nUpCount(a, n));
	}
}
