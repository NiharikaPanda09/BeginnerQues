import java.util.*;


public class validAnaGrams {
    public static void main(String[] args) {
        String s = "anagram";
        String t ="nagaram";
        boolean res = isAnagram(s,t);
        System.out.println(res);


    }
    public static boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()){
            return false;
        }
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();

        Arrays.sort(charS);
        Arrays.sort(charT);
        return Arrays.equals(charS,charT);
    }

}
