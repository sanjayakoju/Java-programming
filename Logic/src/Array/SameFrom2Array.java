package Array;

public class SameFrom2Array {
	
	static int [] sameReturn(int n1[],int n2[],int n4[])
	{
		int min=(n1.length<n2.length)?n1.length:n2.length;
		int n3[]=new int[min];
		int k=0;
		for(int i=0;i<n1.length;i++)
		{
			for(int j=0;j<n2.length;j++)
			{
				for(int t=0;t<n4.length;t++)
				{
					if(n1[i]==n2[j])
					{
						if(n2[j]==n4[t])
						{
							n3[k]=n4[t];
							k++;
						}
					}
				}
			}
		}
		int newA[]=new int[k];
		for(int i=0;i<k;i++)
		{
			newA[i]=n3[i];
		}
		for(int m:newA)
		{
			System.out.println(m);
		}
		return newA;
	}

	public static void main(String[] args) {
		int n1[]= {1,2,3,4,7};
		int n2[]= {1,4,6,9,10,3};
		int n3[]= {1,3,6,9,11};
		sameReturn(n1, n2,n3);
		
	}
}
