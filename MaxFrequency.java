import java.util.*;
public class MaxFrequency {
    public static void main(String[] args) {
        int [] arr = {1,2,2,3,1,4};
        int res = maxFrequencyElements(arr);
        System.out.println(res);

    }

    public static  int maxFrequencyElements(int[] nums) {
        int maxf = func1(nums);
        int disf = func2(nums);
       return Math.max(maxf, disf);


    }

    public static int func1(int[] nums) {
        int ct = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < i; j++) {
                if (nums[i] == nums[j]) {
                    ct++;
                    //ct = ct + 1;
                }

            }
        }
        return ct;
    }

    public static int func2(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < i; j++) {
                if (nums[i] != nums[j]) {
                    res = nums.length;
                }
            }
        }
        return res;
    }
}
