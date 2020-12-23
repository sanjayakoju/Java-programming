package Array;

public class RemoveFromArray {

	static int [] removeElelemt(int n[],int index)
	{
		for(int i=index;i<n.length-1;i++)
		{
			n[i]=n[i+1];
		}
		int n2[]=new int[n.length-1];
		for(int i=0;i<n2.length;i++)
		{
			n2[i]=n[i];
		}
		return n2;
	}
	public static void main(String[] args) {
		int arr[]= {12,22,43,545,646,345,23};
		int a[]=removeElelemt(arr, 2);
		for(int m:a)
		{
			System.out.print(m+",");
		}
	}
}
