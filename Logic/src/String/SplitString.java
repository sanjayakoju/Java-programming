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
            char ch[] = st1.toCharArray();
            int l = ch.length;
            int s = ch.length;
            for (int j = 0; j < 1; j++)
            {
//                s--;
//                temp= ch[s];
//                char a=ch[j];
//                ch[s]=ch[j];
//                l--;

                //Work fine
                temp=ch[s-1];
                char a = ch[j];
                ch[s-1] = a;
                ch[j] = ch[j + 1];
                ch[j + 1] = ch[j + 2];
                ch[s - 2] = temp;

            }
            for (char c : ch) {
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
