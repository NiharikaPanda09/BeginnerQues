import java.util.*;
public class containsDuplicate {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        boolean res = containsDuplicate(arr);
        System.out.println(res);

    }
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i< nums.length-1;i++) {
                if (nums[i]== nums[i+1] ) {
                    return true;
                }

        }
        return false;


    }
}
