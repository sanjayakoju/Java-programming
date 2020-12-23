package Array;

public class IndexOfArray {
	
	static int findIndex(int n[],int a)
	{
		for(int i=0;i<n.length;i++)
		{
			if(n[i]==a)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[]= {12,20,3,46,54,67,90};
		System.out.println("Index of 90 is "+findIndex(arr, 90));
	}
}
