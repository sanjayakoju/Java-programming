package LeapFrogQues;

import java.util.Scanner;

public class Ques2 {

    //Do not edit the main function
    public static void main(String[] args) {

        String input;

        //Get the input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 and 0 only");
        input = scanner.nextLine();

        //Print output returned from the logic function
        System.out.println(logic(input));
    }


    //The function is expected to return an integer.
    //The function accepts String as parameter.
    public static int logic(String input){
        //Write your code here
        //You can create other functions and call from here
        //Don't print anything. Just return the intended output
        int i=0;
        int rem=0;
        int temp=rem;
        int n=Integer.parseInt(input);
        if(n!=0)
        {
            while(n!=0)
            {
                rem=n%10;
                n=n/10;
                if(temp==rem)
                {
                    temp++;
                }
            }
        }
        else if(n<=0)
        {
            rem=n%10;
            n=n/10;
            if(temp==rem)
            {
                temp++;
            }
        }
        return temp;
    }
}
