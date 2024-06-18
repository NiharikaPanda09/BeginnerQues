import java.util.*;
public class Merge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= 151;
        boolean ans = isPallindrome(x);
        System.out.println(ans);


    }
    static boolean isPallindrome(int x) {
        int sum = 0;
        int temp = x;

        while (x > 0) {
            int rev = x % 10;
            sum = sum * 10 + rev;
            x = x / 10;

        }if(temp == sum)
            return true;
        else return false;


    }

    }



