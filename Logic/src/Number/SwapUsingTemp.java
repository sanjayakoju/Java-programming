package Number;

public class SwapUsingTemp {

	public static void main(String[] args) {
		int a=30;
		int b=60;
		b=a+b;
		a=b-a;
		b=b-a;
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}
