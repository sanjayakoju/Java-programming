package Dipendra;

import java.util.ArrayList;
import java.util.List;

public class ArmStrong {
	
	static void sum(int num)
	{
		String st;
        st=String.valueOf(num);
        System.out.println(st);
	}
	
	public static void main(String[] args) {
		int num=1020; // int number
		List<Integer> list=new ArrayList<Integer>();
        sum(num);

		while (num > 0) {
			
			
		    System.out.println( num % 10);
		    num = num / 10;
		    list.add(num%10);
		}
	
		System.out.println(list);
	}

}
