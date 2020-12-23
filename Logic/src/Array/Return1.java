package Array;

public class Return1 {
	
	static int odd(int a[])
	{
		if(a==null || a.length%2==0)
		{
			return 0;
		}
		else
		{
			int midIndex=a.length/2;
			int midValue=a[midIndex];
			for(int i=0;i<a.length;i++)
			{
				if(i!=midIndex && midValue>=a[i])
				{
					return 0;
				}
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		int a[]= {2,1,0,9,10};
		//Return1 ob=new Return1();
		//It is also possible
		int b=Return1.odd(a);
		//int b=odd(a);
		System.out.println(b);
	}
}
