import java.util.*;
public class MinimumLenString {
    public static void main(String[] args) {
        String s = "aabccabba";
        int res = minimumLength(s);
        System.out.println(res);


    }

    public static int minimumLength(String s) {

        int lo = 0;
        int high = s.length() - 1;
        while (lo <= high && s.charAt(lo) == s.charAt(high)) {
            char ch = s.charAt(lo);
            while (lo <= high && s.charAt(lo) == ch) {
                lo++;

            }
            while (lo <= high && s.charAt(high) == ch) {
                high--;
            }


        }
        return high - lo + 1;
    }
}
