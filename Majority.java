public class Majority {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int[] res = majorityElement(arr);
        System.out.println(res);

    }

    public static int[] majorityElement(int[] nums) {
        int ct = 0;
        for (int i = 0; i < nums.length; i++) {

            ct = nums[i];
            int lo = 0;
            int high = nums.length;
            while (lo < high) {
                if (nums[lo] == nums[high]) {
                    ct++;

                }
            }

        }
        return new int[]{ct};
    }
}