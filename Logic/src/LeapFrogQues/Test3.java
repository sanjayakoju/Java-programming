package LeapFrogQues;

import java.util.Scanner;

public class Test3 {
    //Do not edit the main function
    public static void main(String[] args) {

        String input;

        //Get the input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter words");
        input = scanner.nextLine();

        //Print output returned from the logic function
       // System.out.println(logic(input));
    }

    public static String logic(String input){

        String st[]=input.split(" ", 4);
        for(int i=0;i<st.length;i++)
        {
            String s = st[i];
            System.out.println(s);
        }

        return input;
    }
}
