import java.util.*;
public class ArrangeArrays {
    public static void main(String[] args) {
        int[] arr = {3, 1, -2, -5, 2, -4};
        int[] res = rearrangeArray(arr);
        System.out.println(Arrays.toString(res));


    }
    public static int[]  rearrangeArray(int[] nums) {

        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();

        for (int num : nums) {
            if (num > 0) {
                positive.add(num);
            } else {
                negative.add(num);
            }
        }

        int[] result = new int[nums.length];
        int posIndex = 0;
        int negIndex = 0;
        boolean isPositiveTurn = true;

        for (int i = 0; i < result.length; i++) {
            if (isPositiveTurn) {
                result[i] = positive.get(posIndex++);
            } else {
                result[i] = negative.get(negIndex++);
            }
            isPositiveTurn = !isPositiveTurn;
        }

        return result;
    }
}