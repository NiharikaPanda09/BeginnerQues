import java.util.*;
public class AntQ {
    public static void main(String[] args) {
        int[] arr = {-10};
        int res = returnToBoundaryCount(arr);
        System.out.println(res);

    }

    public static int returnToBoundaryCount(int[] nums) {
        int pos = 0;
        int ct = 0;
        for (int i=0;i< nums.length;i++) {
            if (nums[i]<0){
                ct -= Math.abs(nums[i]);

            } else if (nums[i]>0) {
                ct += nums[i];

            }
            if (ct==0) {
                pos++;
            }

        }
return pos;

    }
}