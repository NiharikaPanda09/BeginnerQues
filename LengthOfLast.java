import java.util.*;
public class LengthOfLast {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        int res =lengthOfLastWord(s);
        System.out.println(res);

    }
    public static int lengthOfLastWord(String s) {
        s = s.trim();
       for(int i= s.length()-1;i>=0;i--){
           if(s.charAt(i) == ' '){
               return (s.length()-i-1);

           }
       }
       return s.length();

    }
}
