import java.util.Arrays;

public class MovingZeros {
    public static void main(String[] args) {
        int [] arr = {0,1,0,3,12};
        moveZeroes(arr);
       for(int i=0; i<arr.length; i++){
           System.out.println((arr[i]));
       }
        }


    public static void moveZeroes(int[] nums) {

        int end = nums.length-1;
        for(int i=0; i< nums.length; i++){
          
           if(nums[i] == 0 && i<end){
              int temp = nums[i];
              nums[i] = nums[end];
              nums[end] = temp;
              end--;
              i--;
           }else if(nums[i] !=0){
               nums[i]++;
           }
        }


    }
}
