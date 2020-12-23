package Array;

public class ReverseArray {

	static int[] reverse(int n[]) {
		int s = n.length;
		System.out.println("Size of array : " + s);
		for (int i = 0; i < n.length/2; i++) 
		{
			s--;
			int a = n[i];
			n[i] = n[s];
			n[s] = a;
			
		}

		return n;	
		
	}

	public static void main(String[] args) {

		int n[] = { 1, 2, 3, 4, 5, 6, 7,8,9 };
		int returnArr[]=reverse(n);
		System.out.println("After Reverse");
		for (int i = 0; i < returnArr.length; i++) {
			System.out.print(n[i] + ",");
		}
	}
}
