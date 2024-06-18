import java.util.*;
public class Monotonic {
    public static void main(String[] args) {
        int[] arr = {1, 2,2,3};
        boolean res = isMonotonic(arr);
        System.out.println(res);

    }

    public static boolean isMonotonic(int[] nums) {
       boolean isincreasing = true;
       boolean isdecreasing = true;
       for(int i=0;i< nums.length-1;i++){
           if(nums[i] > nums[i+1]){
               isincreasing = false;
           }else if(nums[i] < nums[i+1]){
               isdecreasing = false;
           }
       }
       return isincreasing || isdecreasing;
    }
}
