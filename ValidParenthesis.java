import java.util.*;
public class ValidParenthesis {
    public static void main(String[] args) {
        String str = "))((";
        String res = minRemoveToMakeValid(str);
        System.out.println(res);


    }

    public static String minRemoveToMakeValid(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        // Loop through the string to process each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(i); // Push index of open parenthesis onto the stack
            } else if (ch == ')') {
                if (!stack.isEmpty()) {
                    stack.pop(); // Match found, pop the open parenthesis index
                    result.append(ch); // Add character to the result
                } else {
                    continue; // Unmatched closing parenthesis, skip adding it to result
                }
            } else {
                result.append(ch); // Add non-parenthesis characters to the result
            }
        }

        // Remove any unmatched open parentheses by their indices
        while (!stack.isEmpty()) {
            int index = stack.pop();
            if (index < result.length()) {
                result.deleteCharAt(index);
            }
        }

        return result.toString();
    }
}