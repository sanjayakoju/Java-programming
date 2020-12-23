package Array;

import java.util.Scanner;

public class MultiplyByLargest {
    Scanner scan=new Scanner(System.in);
	void largest(int n,int m)
	{	
		int arr[][]=new int[n][m];
		int l=arr[0][0];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print("Enter the value");
				int a=scan.nextInt();
				arr[i][j]=a;
			}
		}
		
		System.out.println("Before");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(arr[i][j]>=l)
				{
					l=arr[i][j];
				}
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("After");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[i][j]=l*arr[i][j];
			}
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(arr[i][j]>=l)
				{
					l=arr[i][j];
				}
				System.out.printf("%4s", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter The Size of Matrix");
		int n=scan.nextInt();
		int m=scan.nextInt();
		MultiplyByLargest ml=new MultiplyByLargest();
		ml.largest(n, m);
}
}
