package Array;

public class ContainSpecificValue {
	
	static boolean values(int n[],int a)
	{
		for(int i=0;i<n.length;i++)
		{
			if(n[i]==a)
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		int arr[]= {12,22,14,15,65,60,75};
		System.out.println("ans " +values(arr, 60));
	}

}
