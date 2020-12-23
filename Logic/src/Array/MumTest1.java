package Array;

public class MumTest1 {
	
	static int evenFactor(int m,int n)
	{
		
		int min;
		if(m<n)
			min=m;
		else
			min=n;
		System.out.println("Min="+min);
		
		for(int i=1;i<min;i++)
		{
			if(m%i==0 && i%2==0 )
			{
				if(n%i==0 && i%2==0)
				{
					return 1;
				}
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		int m=18;
		int n=34;
		int a=evenFactor(m, n);
		System.out.println(a);
	}

}
