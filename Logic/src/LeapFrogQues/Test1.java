package LeapFrogQues;

import java.util.Scanner;

public class Test1 {


    static String logic(String str)
    {
        while (str!="\n")
        {
            if(str.regionMatches(0,"x",0,1))
            {
                str.replace("x","z");
            }
            if(str.regionMatches(str.length()-1,"x",1,1))
            {
                str.replace("x","cks");
            }
            if(str.regionMatches(0,"x",0,1) && str.regionMatches(1," ",1,1))
            {
                str.replace("x","eks");
            }
        }
        return  str;
    }

    public static void main(String[] args) {


        String input;

        //Get the input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ");
        input = scanner.nextLine();


        //Print output returned from the logic function
//        System.out.println(logic(input));
        String st=logic(input);
        System.out.println(st);
    }


}
