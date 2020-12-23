package Cotiviti;

import java.util.Scanner;

public class Test1 {

    static int add(int arr[])
    {
        int a = 0;
        for (int i = 0; i < arr.length; i++)
        {
            a = a + arr[i];
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++)
        {
            System.out.println("Enter the data in array");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Adding array data is = " + add(arr));
    }
}
