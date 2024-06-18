import java.util.*;

public class MinBallQuestion {
    public static void main(String[] args) {
        /**
         *
         * the logic is pretty simple
         * for instance arr [] = {0,0,1,0,1,1}
         * for moving number balls
         * {11=for moving all the balls in the first cell we like to require amount of number to be put into that cell
         * if we use a simple logic A num of move - a (is the number balls required) + X (prev ball or 1)
         * {11,8,5,4(5-2+1),3
         *
         */
        MinBallQuestion solution = new MinBallQuestion();
        String boxes = "110";
        int[] result = MinBallQuestion.minOperations(boxes);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    public static int[] minOperations(String boxes) {
        int n = boxes.length();
        int [] result = new int[n];
        for(int i=0;i<n;i++){
            int operation =0;
            for(int j=0;j<n;j++){
                if(boxes.charAt(j) == '1'){
                    operation+= Math.abs(j-i);
                }
            }
            result[i] = operation;
        }
return result;


    }
}
