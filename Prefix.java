import java.util.*;
public class Prefix {
    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};

        String res = longestCommonPrefix(str);
        System.out.println(res);


    }
    public static String longestCommonPrefix(String[] strs) {
       String res = strs[0];
       for(int i=0;i< strs.length;i++){
           while(strs[i].indexOf(res) !=0){
               res = res.substring(0, res.length()-1);
               System.out.println(res);

           }
           if(res.isEmpty()){

               return "";
           }
       }
return res;
    }
}
