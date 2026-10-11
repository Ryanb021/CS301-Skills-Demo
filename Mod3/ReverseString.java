public class ReverseString {
    public static void main(String[] args) {

        // Test
        String word = "Hello";

        // Print original string
        System.out.println("Original: " + word);

        // Print reversed string
        System.out.println("Reversed: " + reverse(word));
    }

    // Method to reverse a string using recursion
    public static String reverse(String text) {

        // If string is empty or one character then stop
        if (text.length() <= 1) {
            return text;
        }

        // Move the 1st character to the end
        return reverse(text.substring(1)) + text.charAt(0);
    }
}
