package Array;

public class LargestNumber {

	int l;
	int largest(int [] a)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=l)
			{
				l=a[i];
			}
		}
		return l;
	}
	
	public static void main(String[] args) {
		int [] n= {3,5,6,2,1,9,5,44};
		LargestNumber ob= new LargestNumber();
		int a=ob.largest(n);
		System.out.println("Largest Value in Array is : "+a);
	}
}
