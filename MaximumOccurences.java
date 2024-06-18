import java.util.*;
import java.util.HashMap;
public class MaximumOccurences {
    public static void main(String[] args) {
        String s1 = "bcbbbcba";
        System.out.println(maximumLengthSubstring(s1));


    }

    public static int maximumLengthSubstring(String s) {

//        // brute force
//        int maxLength = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = i + 1; j <= s.length(); j++) {
//                String substring = s.substring(i, j);
//                if (isValid(substring)) {
//                    maxLength = Math.max(maxLength, substring.length());
//                }
//            }
//        }
//
//        return maxLength;
//    }
//
//    private static boolean isValid(String s) {
//        int[] count = new int[256]; // Assuming ASCII characters
//
//        for (char c : s.toCharArray()) {
//            count[c]++;
//            if (count[c] > 2) {
//                return false;
//            }
//        }
//
//        return true;
//    }
//    }


       /*
       * Sliding window technique
       * */
        HashMap<Character,Integer> map = new HashMap<>();
        int max=0;
        int id =0;
        for(int i=0;i<s.length();i++){
           char c = s.charAt(i);
           map.put(c,map.getOrDefault(c,0)+1);

           while(map.get(c) > 2){
               char idChar = s.charAt(id);
               map.put(idChar,map.get(idChar)-1);
               id++;

           }
           max = Math.max(max,i-id+1);
        }
        return max;



    }
}

