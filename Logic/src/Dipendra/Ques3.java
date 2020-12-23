package Dipendra;

import java.util.Scanner;

public class Ques3 {
	
	static String swap(String st)
	{
		String msg = null;
		char[] c=st.toCharArray();
		char a[]=new char[c.length];
		if(st.length()%2==0)
		{
			int j=2;
			for(int i=0;i<c.length-2;i++)
			{
				
				if(i<j)
				{
					a[i+2]=c[i];
					a[i]=c[i+2];
				}
				j=j+2;				
			}
		}
		else
		{
			msg ="String is not balance";
		}
//		for(char ch:a)
//		{
//			System.out.print(ch);
//		}
		String str=String.copyValueOf(a);
		System.out.println("Output :");
		return str;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Balance String");
		String st=scan.next();
		System.out.println(swap(st));
	}
}
