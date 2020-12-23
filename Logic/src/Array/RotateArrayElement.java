package Array;

public class RotateArrayElement {

    void leftRotate(int arr[], int d,
                    int n)
    {
        // To handle if d >= n
        d = d % n;
        int i, j, k, temp;
        int g_c_d = gcd(d, n);

        for (i = 0; i < g_c_d; i++) {

            // move i-th values of blocks
            temp = arr[i];
            j = i;
            while (true) {
                k = j + d;
                if (k >= n)
                    k = k - n;
                if (k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }

    // function to print an array
    void printArray(int arr[], int size)
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }

    // Function to get gcd of a and b
    int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    public static void main(String[] args)
    {
        RotateArrayElement rotate = new RotateArrayElement();
        int arr[] = { 1, 2, 3, 4, 5 };
        rotate.leftRotate(arr, 1, arr.length);
        rotate.printArray(arr, arr.length);
    }
}
