import java.util.*;

 public class ValidParentheses {
    public boolean isValid(String s) {

        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {

            // Opening brackets
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {

                // No opening bracket available
                if (stack.isEmpty()) {
                    return false;
                }

                // Check matching pair
                if ((ch == ')' && stack.peek() == '(') ||
                    (ch == ']' && stack.peek() == '[') ||
                    (ch == '}' && stack.peek() == '{')) {

                    stack.pop();

                } else {
                    return false;
                }
            }
        }

        // All brackets should be matched
        return stack.isEmpty();
    }
}
