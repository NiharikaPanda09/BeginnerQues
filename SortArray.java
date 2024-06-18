import java.util.Arrays;
import java.util.Comparator;

public class SortArray {
    public static void main(String[] args) {
        SortArray sorter = new SortArray();

        // Example usage
        int[][] scores = {
                {10, 6, 9, 1},
                {7, 5, 11, 2},
                {4, 8, 3, 15}
        };

        int k = 2; // Sort based on the third column (0-indexed)

        int[][] sortedScores = sorter.sortTheStudents(scores, k);

        // Print the sorted array
        for (int[] student : sortedScores) {
            System.out.println(Arrays.toString(student));
        }
    }

    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score, Comparator.comparingInt(a -> a[k]));
        int i=0; int j = score.length-1;
        while ((i < j)) {

            int [] temp = score[i];
            score[i] = score[j];
            score[j] = temp;
            i++;
            j--;
        }
        return score;
    }
}
