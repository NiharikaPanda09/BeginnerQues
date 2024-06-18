import java.util.*;
public class Employee {
    public static void main(String[] args) {
        int [] arr ={0,1,2,3,4};
        int target = 2;
        int res = numberOfEmployeesWhoMetTarget(arr,target);
        System.out.println(res);

    }
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int ct=0;
        for(int i=0;i<hours.length;i++){
            int arr = hours[i];
            if(arr >= target){
                ct++;
            }
        }
        return ct;

    }
}
