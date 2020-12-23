package Array;

public class Mum3 {

	char[] f(char c[],int start,int len)
	{
		if(start<0 || len<0 || start+len-1>=c.length)
		{
			return null;
		}
		else
		{
			char r[]=new char[len];
			for(int i=start,j=0;j<len; i++, j++)
			{
				r[j]=c[i];
			}
			return r;
		}
	}
	public static void main(String[] args) {
		char c[]= {'a','b','c','d','e'};
		Mum3 m=new Mum3();
		char a[]=m.f(c,1,4);
		System.out.println(a);
	}
}
