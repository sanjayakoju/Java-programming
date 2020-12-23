package Array;

public class SeparateEvenOdd {
	static int[] separate(int n[]) 
	{
		int left=0;
		int right=n.length-1;
		while(left<right)
		{
			while(n[left]%2==0 && left<right)
				left++;
			
			while(n[right]%2==1 && left<right)
				right--;
			
			if(left<right)
			{
				int temp=n[left];
				n[left]=n[right];
				n[right]=temp;
				left++;
				right--;
			}
		}
		return n;
	}

	public static void main(String[] args) 
	{
		int arr[] = { 1, 2, 3, 4, 5, 6, 7,9,66,8 };
		arr = separate(arr);
		for (int m : arr) 
		{
			System.out.print(m + ",");
		}
	}

}
