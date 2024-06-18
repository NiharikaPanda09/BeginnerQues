import java.util.*;



public class MaxWords {
    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int res = mostWordsFound(sentences);
        System.out.println(res);

    }
    public static int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String Sentence:sentences){
            int len = Sentence.split(" ").length;
            max = Math.max(max,len);
        }
        return max;
    }
}
