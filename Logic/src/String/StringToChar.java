package String;

public class StringToChar {

    public static void main(String[] args) {
         String str ="Hello World352";
         str.trim();
         char ch[]=str.toCharArray();
         for(int i=0;i<ch.length;i++)
         {
             System.out.println(ch[i]);
         }

    }
}
