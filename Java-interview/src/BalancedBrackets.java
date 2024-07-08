import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        String[] testStrings = {
                "{}()",
                "{()}",
                "({})",
                "({)}",
                "{{}}",
                "(({}))",
                "({[)]}"
        };

        for (String s : testStrings) {
            System.out.println(s + ": " + isBalanced(s));
        }
    }

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char open = stack.pop();
                if (!isMatchingPair(open, ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') || (open == '{' && close == '}');
    }
}
