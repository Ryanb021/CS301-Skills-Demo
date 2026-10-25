import java.util.Stack;
import java.util.Scanner;

public class Parentheses {
    public static void main(String[] args) {
        
        // Create scanner to read input
        Scanner input = new Scanner(System.in);

        // Useer enter parentheses
        System.out.print("Enter parentheses: ");
        String text = input.nextLine();

        // Create stack to store opening brackets
        Stack<Character> stack = new Stack<Character>();

        // Assume the brackets are balanced
        boolean balanced = true;

        // Check the character in the string
        for (int i = 0; i < text.length(); i++) {

            char current = text.charAt(i);

            // Add opening brackets to stack
            if (current == '(' || current == '[' || current == '{'){
                stack.push(current);
            }

            // Check closing brackets
            else if (current == ')' || current == ']' || current == '}') {

                // No opening bracket available
                if (stack.isEmpty()) {
                    balanced = false;
                    break;
                }

                // Remove recent opening bracket
                char opening = stack.pop();

                // Check if braclets match
                if (current == ')' && opening != '(' || current == ']' && opening != '[' || current == '}' && opening != '{') {

                    balanced = false;
                    break;
                }
            }
        }

        // Check if any opening brackets remain
        if (!stack.isEmpty()) {
            balanced = false;
        }

        // Display the result
        System.out.println(balanced);

        input.close();
    }
}
