import java.util.*;
public class RichCusWealth {
    public static void main(String[] args) {
        int [][] arr = {{1,5},{7,3},{3,5}};
        int res = maximumWealth(arr);
        System.out.println(res);

    }
    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for(int i=0;i<accounts.length;i++){
            int sum =0;
            for(int j=0;j<accounts[i].length;j++){
                int arr = accounts[i][j];
                sum = sum + accounts[i][j];

            }
            maxWealth = Math.max(maxWealth,sum);
        }
        return maxWealth;


    }
}
