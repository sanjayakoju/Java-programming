package LeapFrogQues;

import java.util.Scanner;

public class Test2 {

    //Do not edit the main function
    public static void main(String[] args) {

        String input;

        //Get the input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Digit only");
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
    int str=0;
    String str1="";
    String st[]=input.split(",");
    int n[]=new int[st.length];
    for(int i=0;i<st.length;i++)
    {
        n[i]=Integer.parseInt(st[i]);
    }
    for(int i=0;i<n.length;)
    {
        if(n[i]<n[i+1])
        {
            str=n[i+1];
//            str1=str.toString();
        }
        else if(n[i]>n[i+1])
        {
            str=n[i];
//            str1=str.toString();
        }
        else if(n[i]==n[i+1])
        {
            str1="total carnage";
        }
        i=i+2;
    }
        return str1;
    }
}
