import java.util.*;
public class FinalValue {
    public static void main(String[] args) {
        String [] str = {"--X"};
        int res = finalValueAfterOperations(str);
        System.out.println(finalValueAfterOperations(str));


    }
    public static int finalValueAfterOperations(String[] operations) {
       int x =0;
       for(int i =0; i<operations.length; i++){
           String str = operations[i];
           if(str.equals("X++")){
               x++;
           }else if(str.equals("X--")){
               x--;
           } else if (str.equals("--X")) {
               --x;

           } else if (str.equals("++X")) {
               ++x;

           }
       }
       return x;
    }
}
