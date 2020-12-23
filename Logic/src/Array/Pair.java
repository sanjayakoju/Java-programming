package Array;

public class Pair {

	static boolean pair(int n[],int l,int v)
	{
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<l-1;j++)
			{
				int sum=n[i]+n[j];
				if(sum==v)
					return true;
			}
			
		}
		return false;
	}
	
	public static void main(String[] args) {
		int n[]= {10,20,40,13,23};
		int l=n.length;
		int v=50;
		boolean r=pair(n,l,v);
		System.out.println(r);
	}
}
