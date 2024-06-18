import java.util.*;

public class Anagrams {
    public static void main(String[] args) {
        // Example usage
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(strs);
        System.out.println(result);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {
            if (!visited[i]) {
                List<String> anagrams = new ArrayList<>();
                anagrams.add(strs[i]);
                visited[i] = true;

                for (int j = i + 1; j < strs.length; j++) {
                    if (!visited[j] && isAnagram(strs[i], strs[j])) {
                        anagrams.add(strs[j]);
                        visited[j] = true;
                    }
                }

                result.add(anagrams);
            }
        }

        return result;
    }

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}
