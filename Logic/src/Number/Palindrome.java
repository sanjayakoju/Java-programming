package Number;

public class Palindrome {

	String s(int n)
	{
		String msg="Not Palindrome";
		int rev=0;
		int temp = n;
		int rem;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(rev==temp)
		{
			msg="Palindrome";
			return msg;
		}
		return msg;
	}
	public static void main(String[] args) {
		int n=321230;
		Palindrome p=new Palindrome();
		String msg=p.s(n);
		System.out.println(msg);
	}
}
