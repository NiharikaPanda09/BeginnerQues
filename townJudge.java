import java.util.*;
public class townJudge {
    public static void main(String[] args) {
        int[][] trust1 = {{1, 2}};
        int n1 = 2;
        System.out.println("Town Judge for Example 1: " + findJudge(n1, trust1)); // Output: 2
    }
    public static int findJudge(int n, int[][] trust) {
        int[] trustsReceived = new int[n + 1];

        for (int i = 0; i < trust.length; i++) {
            int personA = trust[i][0];
            int personB = trust[i][1];
            trustsReceived[personB]++;

            trustsReceived[personA]--;
        }

        for (int i = 1; i <= n; i++) {
            if (trustsReceived[i] == n - 1) {
                return i;
            }
        }

        return -1;
    }
}
