package Array;

public class MergeArray {

//	static int[] mergeWithTemp(int n1[], int n2[],int n3[],int s1,int s2) {
//		int i=0,j=0,k=0;
//		while(i<s1 && j<s2)
//		{
//			if(n1[i]<n2[j])
//			{
//				n3[k++]=n1[i++];
//			}
//			else
//			{
//				n3[k++]=n2[j++];
//			}
//		}
//		while(i<s1)
//		{
//			n3[k++]=n1[i++];
//		}
//		while(j<s2)
//		{
//			n3[k++]=n2[j++];
//		}
//		return n3;
//	}
	
	static int [] mergeWithoutTemp(int n1[],int n2[])
	{
		int l1=n1.length;
		int l2=n2.length;
		int n3[]=new int[l1+l2];
		for(int i=0;i<n1.length;i++)
		{
			n3[i]=n1[i];
		}
		for(int j=0;j<l2;j++)
		{
			n3[l1]=n2[j];
			l1++;
		}
		return n3;
	}

	public static void main(String[] args) {
		int arr1[] = { 1, 200, 3, 4, 5, 600 };
		int arr2[] = { 34, 45, 66, 77, 655 };
		int s1 = arr1.length;
		int s2 = arr2.length;
		int s3 = s1 + s2;
		int arr3[] = new int[s3];
//		arr3=mergeWithTemp(arr1, arr2, arr3, s1, s2);
//		for(int m:arr3)
//		{
//			System.out.print(m+",");
//		}
		arr3=mergeWithoutTemp(arr1, arr2);
		for(int m:arr3)
		{
			System.out.print(m+",");
		}
	}
}
