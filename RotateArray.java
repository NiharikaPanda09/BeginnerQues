import java.util.*;
public class RotateArray {
    public static void main(String[] args) {
     int [] arr = {1,2,3,4,5,6,7};
     int k = 3;
        rotate(arr,k);


            System.out.println(Arrays.toString(arr));

    }
    public static void rotate(int[] nums, int k) {
        int [] temp  = new int[nums.length];
        for(int i=0;i< nums.length;i++){
            temp[(i+k) % nums.length] = nums[i];

        }
        System.arraycopy(temp,0,nums,0,nums.length);

    }
}
