package Number;

public class PrimeNo100 {
	
	public void primeNumber()
	{
		int n=1;
		int prim=0;
		for(int i=1;i<=n;i++,n++)
		{
			int c=0;
			if(prim!=100)
			{
				for(int j=1;j<=i;j++)
				{
					if(i%j==0)
					{
						c++;
					}
				}
				if(c==2)
				{
					prim++;
					System.out.println("SN: "+prim+" prime "+i);
				}
			}
			
		}
	}
	
	public static void main(String[] args) {
		PrimeNo100 ob=new PrimeNo100();
		ob.primeNumber();
	}

}
