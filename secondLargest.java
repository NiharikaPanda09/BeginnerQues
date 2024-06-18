import java.util.*;

public class secondLargest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        int res = s2largest(arr);
        System.out.println(res);

    }
    public static int s2largest(int[] a){
        int seclargest = Seclargest(a);
        return seclargest;

    }
    public static int Seclargest(int [] a){
        int largest = a[0];
        int slargest = -1;
        for(int i=0;i<a.length ;i++){
            if(a[i] > largest){
                slargest = largest;
                largest = a[i];
            }else if(a[i] < largest){
                slargest = a[i];
            }
        }
        return slargest;
    }
}
