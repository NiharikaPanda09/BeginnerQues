import java.util.*;
public class BitOperator {
    public static void main(String[] args) {

        int left = 5;
        int right = 7;
        System.out.println(rangeBitwiseAnd(left,right));

    }
    public  static int rangeBitwiseAnd(int left, int right) {
        int res =0;
       while(left<right){
           left >>=1;
           right >>=1;
           res++;
       }
       return left << res;

    }
}
