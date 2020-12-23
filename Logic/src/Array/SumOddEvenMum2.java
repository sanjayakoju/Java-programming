package Array;

public class SumOddEvenMum2 {

	int sum(int a[])
	{
		if(a==null)
		{
			return 0;
		}
		int odd = 0;
		int even = 0;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]%2==0)
				{
					even=a[i]+even;
				}
				else
				{
					odd=a[i]+odd;
				}
				
			}
		return odd-even;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		SumOddEvenMum2 ob=new SumOddEvenMum2();
		int o=ob.sum(arr);
		System.out.println(o);
	}
}
