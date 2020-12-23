package Array;

public class Mum5 {
	
	int []r(int n1[],int n2[])
	{
		int min=(n1.length<n2.length)? n1.length:n2.length;
		int k=0;
		int same[]=new int[min];
		for(int i=0;i<n1.length;i++)
		{
			for(int j=0;j<n2.length;j++)
			{
				if(n1[i]==n2[j])
				{
					same[k]=n1[i];
					k++;
				}
			}
		}
		int sam[]=new int[k];
		for(int i=0;i<sam.length;i++)
		{
			sam[i]=same[i];
		}
		return sam;
	}
	
	public static void main(String[] args) {
		int n1[]= {1,2,3,6,7,9};
		int n2[]= {2,3,4,6,7};
		Mum5 a=new Mum5();
		int b[]=a.r(n1,n2);
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}
}
