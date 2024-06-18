import java.util.*;
public class InfiniteArray {
    public static void main(String[] args) {
        int [] arr = {1,2,4,8,10,12,14};
        int target = 14;
        System.out.println(Ans(arr,target));

    }
    static int Ans(int [] arr, int target){
        int start =0;
         int end = 1;
          while(target > end){
               int newStart =end +1;
               end = end +(end - start +1)*2;
               start = newStart;
          }
          return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[] arr,int target,int start,int end){

        while(start <= end){
            int mid = start + (end-start)/2;
            if(target > arr[mid]){
                start = mid+1;
            } else if (target < arr[mid]) {
                end = mid-1;
            }else {
                return mid;
            }
        }
        return -1;

    }
}
