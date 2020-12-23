package Number;

import java.util.Scanner;

public class HaveNegativeNumber {

    static boolean hasNegativeCheck(int array[])
    {
        boolean b=false;
        for (int i=0;i<array.length;i++)
        {
            if(array[i]<0)
            {
                b=true;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scanner.nextInt();
        int arr[]= new int[size];
        for (int i=0;i<size;i++)
        {
            System.out.println("Enter number");
            arr[i]=scanner.nextInt();
        }
        System.out.println("The given have a negative no is = "+hasNegativeCheck(arr));

    }
}
