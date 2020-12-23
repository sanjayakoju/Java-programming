package Array;

public class InsertElementInArray {

	static int [] returnArray(int arr[],int indx,int value)
	{
		
		for(int i=arr.length-1;i>indx;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[indx]=value;
		return arr;
	}
	public static void main(String[] args) {
		int arr[]={1,2,4,5,6,7};
		int index=2;
		int value=3;
		arr=returnArray(arr, index, value);
		for(int m:arr)
		{
			System.out.print(m+",");
		}
	}
}
