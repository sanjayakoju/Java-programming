package Cotiviti;


import java.util.Arrays;

public class MyTest {

	static void isBinary()
	{
		boolean isBinary=false;
		int n=1230120;
		while(n!=0)
		{
			if (n % 10 > 1) {
				System.out.println(n%10);
				isBinary= false;
				break;
			}
			n = n / 10;
			isBinary= true;
		}
		System.out.println("The given number isBinary :"+isBinary);
	}

	static void duplicateCharacter()
	{
		String str1="aabbcc";
		char[] ch1=str1.toCharArray();
		for(int i=0;i<ch1.length;i++)
		{
			for(int j=i+1;j<ch1.length;j++)
			{
				if((ch1[i] == ch1[j]) && (i!=j))
				{
					System.out.println("Duplicate character : "+ch1[i]);
				}
			}
		}
	}

	static void largestElement()
	{
		int num[]={1,2,3,4,5};
		Arrays.sort(num);
		for(int i=num.length-1;i>num.length-3;i--)
		{
			System.out.println(num[i]);
		}
		for(int i=0; i<num.length;i++)
		{
			System.out.println(num[i]);
		}
	}
	public static void main(String[] args) {
		isBinary();
		duplicateCharacter();
		largestElement();
	}
}
