package Array;

public class MinMax {
	
	static int min(int arr[])
	{
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
				min=arr[i];
		}
		return min;
	}
	static int max(int arr[])
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];
		}
		return max;
	}
	public static void main(String[] args) {
		int arr[]= {2,1,3,3,433,22,23};
		int m=min(arr);
		System.out.println("min "+m);
		System.out.println("max "+max(arr));
	}

}
