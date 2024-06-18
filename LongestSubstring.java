import java.util.*;
public class LongestSubstring {
    public static void main(String[] args) {
    String s = "abcabcbb";
    int res = lengthOfLongestSubstring(s);
        System.out.println(res);
    }
    public static int lengthOfLongestSubstring(String s) {
        int left =0,maxlength=0;
        HashSet<Character> set = new HashSet<>();
        for(int right=0;right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxlength = Math.max(maxlength,right-left+1);
        }
        return maxlength;
    }
}
