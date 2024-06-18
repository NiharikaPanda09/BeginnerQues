import java.util.*;
public class subString {
    public static void main(String[] args) {
        String str = "aaa";
        int res = countSubstrings(str);
        System.out.println(res);
    }

    public static int countSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String substr = s.substring(i, j);
                if (isPalindrome(substr)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}