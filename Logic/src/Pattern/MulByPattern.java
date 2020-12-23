package Pattern;

public class MulByPattern {
	int a=2;
	int m=9;
	void mul(int n)
	{
		for(int i=1;i<=n;i++)
		{
			int sum=0;
			String s="";
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
				s=s+j;
			}
			int b=Integer.parseInt(s);
			sum=(b*m)+a;
			System.out.println(" * "+m+" + "+a+" = "+sum);
			a++;
		}
	}
	public static void main(String[] args) {
		MulByPattern m=new MulByPattern();
		m.mul(8);
	}

}
