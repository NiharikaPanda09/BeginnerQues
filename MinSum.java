import java.util.*;
import java.util.Arrays;
public class MinSum {
    public static void main(String[] args) {
      int arr = 4009;
        System.out.println(minimumSum(arr));


    }
    public static int minimumSum(int num) {

        int [] digits = new int[4];
        for(int i=0;i<4;i++){
            digits[i] = num%10;
            num = num/10;


        }
        Arrays.sort(digits);
        int num1 = digits[0]*10 + digits[3];
        int num2 = digits[1]*10 + digits[2];
        int sum = num1+num2;
        return sum;
    }
}
