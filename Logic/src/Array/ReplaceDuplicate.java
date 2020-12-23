package Array;

import java.util.Arrays;

public class ReplaceDuplicate {

	static int [] unique(int n[]) {
		int l=n.length;
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				if(n[i]==n[j])
				{
					n[j]=n[l-1];
					l--;
					j--;
				}
			}
		}
		for(int m:n)
		{
			System.out.println(m);
		}
		int[] array1 = new int[l];
		for(int i=0;i<l;i++)
		{
			array1[i]=n[i];
		}
		return array1;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,5,2,3,11,1};
		arr=unique(arr);
		System.out.println("After removing duplicate element from array");
		for(int m:arr)
		{
			System.out.print(m+",");
		}
	}
}
