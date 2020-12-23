package LeapFrogQues;

import java.util.Scanner;

public class Ques3 {

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
        char ch[]=input.toCharArray();
        char cha[]=new char[10];
        int j=0;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' || ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U')
            {
                //System.out.println(j);
                char c=ch[i];
                cha[j]=c;
                //System.out.println(cha[j]);
                j++;
                //System.out.println(c);
            }
        }
//        for(char c:cha)
//        {
//            System.out.print(c);
//        }
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' || ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U')
            {
                ch[i]=cha[1];
            }
            else
            {
                ch[i]=ch[i];
            }
        }
//        for(char c:ch)
//        {
//            System.out.print(c);
//        }
        for(int i=ch.length-1;i>=0;i--)
        {
            if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' || ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U')
            {
                ch[i]=cha[0];
                break;
            }

        }
//        for(char c:ch)
//        {
//            System.out.print(c);
//        }
        output =new String(ch);
        return output;
    }
}
