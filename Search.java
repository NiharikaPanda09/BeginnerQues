import java.util.*;
public class Search {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,6,8,90};
        int target = 8;
        int ans = Insert(arr,target);
        System.out.println(ans);


    }
    static int Insert(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
        int mid = start + (end-start)/2;
            if(target > arr[mid] ){
                start = mid+1;
            }else if(target < arr[mid]){
                end = mid-1;

            }else{
                return mid;
            }
        }
        return -1;
    }
}
