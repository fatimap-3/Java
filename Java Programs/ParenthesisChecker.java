package sem3cosc2006;
import java.util.Scanner;
public class ParenthesisChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        if (isValidParentheses(inputString)) {
            System.out.println("The string \"" + inputString + "\" has the correct number of parentheses.");
        } else {
            System.out.println("The string \"" + inputString + "\" has mismatched parentheses.");
        }

        scanner.close();
    }

    private static boolean isValidParentheses(String input) {
        GenericArrayStack<Character> stack = new GenericArrayStack<>();

        for (char c : input.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false; // More closing parentheses than opening ones
                }
                stack.pop();
            }
        }

        return stack.isEmpty(); // True if the number of opening and closing parentheses match
    }
}