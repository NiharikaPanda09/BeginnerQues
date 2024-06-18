import java.util.*;
public class RemoveDupilcates {
    public static void main(String[] args) {


    }
    public int removeDuplicates(int[] nums) {
        int i =nums[0];
        for(int j=1;j< nums.length;j++){
            if(nums[j] != nums[i] ){
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;


    }
}
