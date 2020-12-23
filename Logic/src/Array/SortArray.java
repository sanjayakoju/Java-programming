package Array;

public class SortArray {

	static int[] sort(int n1[])
	{
		int temp;
		for(int i=0;i<n1.length-1;i++)
		{
			for(int j=0;j<=n1.length-2;j++)
			{
				if(n1[j]>n1[j+1])
				{
					temp=n1[j];
					n1[j]=n1[j+1];
					n1[j+1]=temp;
				}
			}
		}
		return n1;
	}
	public static void main(String[] args) {
		int arr[]= {12,2,32,1,4,55,3,11};
		arr=sort(arr);
		for(int m:arr)
		{
			System.out.print(m+",");
		}
	}
}
