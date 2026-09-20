
import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string with parentheses:");
        String s = scanner.nextLine();
        if (isBalanced(s)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        scanner.close();
    }

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char lastOpen = stack.pop();
                if ((ch == ')' && lastOpen != '(') || (ch == '}' && lastOpen != '{') || (ch == ']' && lastOpen != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
