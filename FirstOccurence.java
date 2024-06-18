public class FirstOccurence {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "but";
        int res = strStr(haystack,needle);
        System.out.println(res);


    }
    public static int  strStr(String haystack, String needle) {
       for(int i=0;i<haystack.length()-needle.length()+1;i++){
           if(haystack.charAt(i) == needle.charAt(0)){
               if(haystack.startsWith(needle, i)){
                   return i;


               }
           }
       }
       return -1;


    }
}
