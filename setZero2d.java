import java.util.*;
public class setZero2d {
    public static void main(String[] args) {
        int[][] arr = {
                {7, 19, 3},
                {4, 21, 0}
        };
        setZeros(arr);
        // Print the modified array to check the result
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }


    }

    public static void setZeros(int[][] matrix) {
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (matrix[i][j] == 0) {
//                    markRowAndCol(matrix, i, j);
//                }
//            }
//        }
//
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (matrix[i][j] == -1) {
//                    matrix[i][j] = 0;
//                }
//            }
//        }
//    }
//
//    public static void markRowAndCol(int[][] matrix, int row, int col) {
//        // Mark the entire row as -1
//        for (int i = 0; i < matrix.length; i++) {
//            if (matrix[i][col] != 0) {
//                matrix[i][col] = -1;
//            }
//        }
//
//        // Mark the entire column as -1
//        for (int j = 0; j < matrix[row].length; j++) {
//            if (matrix[row][j] != 0) {
//                matrix[row][j] = -1;
//            }
//        }
//    }


        boolean fr=false;
        boolean fc = false;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    if(i == 0){
                        fr=true;
                    }
                    if( j==0){
                        fc = true;
                    }
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] =0;
                }
            }
        }
        if(fr){
            for(int j=0;j<matrix[0].length;j++){
                matrix[0][j] =0;
            }
        }
        if(fc){
            for(int i=0;i< matrix.length;i++){
                matrix[i][0] = 0;
            }
        }




    }
}
