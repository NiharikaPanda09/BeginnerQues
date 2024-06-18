import java.util.*;
public class TriangleProblem {
    public static void main(String[] args) {
        int[] arr = {3, 4, 3};
        String res = (triangleType(arr));
        System.out.println(res);


    }

    public static String triangleType(int[] nums) {
        if (nums[0] + nums[1] > nums[2] && nums[1] + nums[2] > nums[0] && nums[0] + nums[2] > nums[1]) {

            if (nums[0] == nums[1] && nums[1] == nums[2]) {
                return "equilateral";
            } else if (nums[0] == nums[1] || nums[0] == nums[2] || nums[1] == nums[2]) {
                return "isosceles";

            } else if (nums[0] != nums[1] && nums[1] != nums[2] && nums[0] != nums[2]) {
                return "scalene";
            }

        }
        return "none";
    }
}
