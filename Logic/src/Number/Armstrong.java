package Number;

public class Armstrong {

	static String check(int n) {
		int temp = n;
		int sum = 0;
		int a;
		while (n != 0) 
		{
			a = n % 10;
			sum = sum + (a * a * a);
			n = n / 10;
		}
		if (temp == sum) 
		{
			return "Armstrong";
		}
		return "Not Armstrong";
	}

	public static void main(String[] args) {
		int a = 153;
		String st = check(a);
		System.out.println(st);
	}
}
