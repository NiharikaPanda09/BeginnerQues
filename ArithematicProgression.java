import java.util.*;
public class ArithematicProgression {
    public static void main(String[] args) {
        int [] arr = {1,2,4};
       boolean res =  canMakeArithmeticProgression(arr);
        System.out.println(res);

    }
    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int commonDiff = arr[1] - arr[0];
        for(int i=2;i< arr.length;i++){
            if(arr[i]-arr[i-1] != commonDiff){
                return false;

            }
        }
        return true;

    }
}
