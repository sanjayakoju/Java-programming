package Array;

public class DuplicateElement {

	static void count(int arr[])
	{
		int l=arr.length;
		int d[]=new int[l];
		int dup=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if((arr[i]==arr[j]) && (i!=j))
				{
					d[dup] = arr[i];
                    System.out.println("Duplicate elements are :"+arr[i]);
					dup++;
				}
			}
		}
//		for(int m:d)
//		{
//			System.out.println(m);
//		}
	}
	public static void main(String[] args) {
		int arr[]= {1,2,33,22,2,22,33,1};
		count(arr);
	}
}
