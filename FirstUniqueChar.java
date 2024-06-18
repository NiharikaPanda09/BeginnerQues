import java.util.*;
public class FirstUniqueChar {
    public static void main(String[] args) {
        String s = "loveleetcode";
        int res = firstUniqChar(s);
        System.out.println(res);

    }
    public static int firstUniqChar(String s) {
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            boolean isUnique = true;


            for (int j = 0; j < s.length(); j++) {
                if (i != j && ch ==s.charAt(j)){
                    isUnique = false;
                    break;
                }

                }
            if(isUnique){
                return i;
            }
            }
        return -1;

        }
}
