package Number;

public class ReverseMum4 {

	int f(int n)
	{
		int rev=0;
		int rem;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev;
	}
	public static void main(String[] args) {
		int n=-1234;
		ReverseMum4 rev=new ReverseMum4();
		int a=rev.f(n);
		System.out.println(a);
	}
}
