package String;

import java.util.Scanner;

public class SplitString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //System.out.println("Enter words");
        //String str = scan.next();
        String out = "";
        String st = "Take hell dsfdsf sdg";
        //st=st.concat(" hee sdg");
        String[] arrOfStr = st.split("\\s");

//        for (String a : arrOfStr)
//            System.out.println(a);

        char temp;

        for (int i = 0; i < arrOfStr.length; i++)
        {
            String st1 = arrOfStr[i];
            char arr[] = st1.toCharArray();
            int l = arr.length;
            int s = arr.length;
            for (int j = 0; j < 1; j++)
            {

                int k;
                char first;

                first = arr[0];

                for(k = 0; k <arr.length-1; k++)
                {
                    //Shift element of array by one
                    arr[k] = arr[k+1];
                }


                arr[k] = first;

                //Work fine
//                temp=ch[s-1];
//                char a = ch[j];
//                ch[s-1] = a;
//                ch[j] = ch[j + 1];
//                ch[j + 1] = ch[j + 2];
//                ch[s - 2] = temp;

            }
            for (char c : arr) {
                System.out.print(c);
                char cout = c;
                out = out + c;
            }
            out = out + "arg ";
        }
        System.out.println();
        System.out.println(out);

    }
}
