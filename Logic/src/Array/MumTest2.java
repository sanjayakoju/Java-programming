package Array;

public class MumTest2 {

	static int even(int n[])
	{
		int even=1;
		for(int i=0;i<n.length-1;i++)
		{
			if(n[i]%2==0 && n[i+1]%2==0)
			{
				even++;
			}
			else if(n[i]%2==0)
			{
				even++;
			}
		}
		if(even==2)
			return 1;
		return 0;
	}
	public static void main(String[] args) {
		int n[]= {1,2,6,3,5,8};
		int a=even(n);
		System.out.println(a);
	}
}
