import java.util.*;
public class ValidP {
    public static void main(String[] args) {
        String s = "(()))";
        boolean res = checkValidString(s);
        System.out.println(res);

    }
    public static boolean checkValidString(String s) {
        int start =0;int end =0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '(' || c == '*') {
                start++;
            }else{
                start--;
            }
            if(start < 0){
                return false;
            }
            }
        if(start == 0){
            return true;
        }
        for(int i=s.length()-1;i>0;i--){
            char c= s.charAt(i);
            if(c == ')' ||  c =='*'){
                end++;
            }else {
                end--;
            }
            if(end <0){
                return false;
            }
        }
        return true;




    }
}
