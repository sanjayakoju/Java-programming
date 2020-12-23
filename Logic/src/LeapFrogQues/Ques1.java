package LeapFrogQues;

import java.util.Scanner;

public class Ques1 {

    //Do not edit the main function
    public static void main(String[] args) {

        String input;

        //Get the input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter words");
        input = scanner.nextLine();

        //Print output returned from the logic function
        System.out.println(logic(input));
    }


    //The function is expected to return a String.
    //The function accepts String as parameter.
    public static String logic(String input){
        //Write your code here
        //You can create other functions and call from here
        //Don't print anything. Just return the intended output
        String output="";
        String st[]=input.split("\\s");
        for(String s:st)
        {
            char ch[]=s.toCharArray();
            for(int i=0;i<ch.length;i++)
            {
                if(i==0)
                {
                    ch[0] = Character.toLowerCase(ch[0]);
                }
                else
                {
                    ch[i]=Character.toUpperCase(ch[i]);
                }

            }

            output =output+ new String(ch);
        }

        return output;
    }
}
