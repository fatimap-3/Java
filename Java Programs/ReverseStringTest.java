package sem3cosc2006;
import java.util.Scanner;
public class ReverseStringTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        GenericArrayStack<Character> stack = new GenericArrayStack<>();

        // Push each character onto the stack
        for (char c : inputString.toCharArray()) {
            stack.push(c);
        }

        System.out.print("Reversed String: ");

        // Pop each character and print
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

        scanner.close();
    }
}