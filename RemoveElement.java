import java.util.*;

import static java.util.Arrays.sort;

public class RemoveElement {
    public static void main(String[] args) {
        RemoveElement remover = new RemoveElement();
        int [] nums = {0,1,2,2,3,0,4,2};
       int  val = 2;
        int k = remover.removeElement(nums,val);

        int [] expectedNums = {1,3};
        assert k == expectedNums.length;
        sort(nums,0,k);
        for(int i=0; i< nums.length; i++){
            assert nums[i] == expectedNums[i];
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(k);


    }
    public int removeElement(int[] nums, int val) {

        int start = 0;
        int end = nums.length-1;

        while(start <= end){
            if(nums[start] == val){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                end--;
            }else{
                start++;
            }

        }


return start;
    }
}
