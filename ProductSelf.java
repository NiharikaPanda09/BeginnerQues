import java.util.*;
public class ProductSelf {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        int [] res = productExceptSelf(arr);
        System.out.println(Arrays.toString(res));

    }
    public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        Arrays.fill(res, 1);
        int prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            res[i] = prefix;
            prefix *= nums[i];
        }
        int postfix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] *= postfix;
            postfix *= nums[i];
        }
        return res;
    }
}
