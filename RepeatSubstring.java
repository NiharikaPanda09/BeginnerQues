import java.util.*;
public class RepeatSubstring {
    public static void main(String[] args) {
        String s = "abcabc";
        boolean res = repeatedSubstringPattern(s);
        System.out.println(res);


    }

    public static boolean repeatedSubstringPattern(String s) {
//        int n = s.length();
//        for (int i = 1; i <= n / 2; i++) { // i represents the length of potential substrings
//            if (n % i == 0) { // Check if the length of the string is divisible by i
//                int j = 0;
//                while (j + i < n && s.charAt(j) == s.charAt(j + i)) {
//                    j++;
//                }
//                if (j + i == n) {
//                    return true; // Found a repeated substring
//                }
//            }
//        }
//        return false; // No repeated substring found
//    }
//}





        int n = s.length();
        for (int len = 1; len <= n / 2; len++) {
            if (n % len == 0) {
                String pattern = s.substring(0, len);
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < n / len; i++) {
                    sb.append(pattern);
                }
                if (sb.toString().equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }
}