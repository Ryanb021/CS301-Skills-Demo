public class Once {

    public static void main(String[] args) {
        
        // Get string from command line
        String text = args[0];

        // Check each character in the string
        for (int i = 0; i < text.length(); i++) {

            // Get current character
            char current = text.charAt(i);

            // Count how many times the character appears
            int count = 0;

            for (int j = 0; j < text.length(); j ++) {

                // Checj if the characters match
                if (current == text.charAt(j)) {
                    count++;
                }
            }

            // Print first character that appears once
            if (count == 1) {
                System.out.println(current);
                return;
            }
        }

        // Print a message if no unique character is found
        System.out.println("No unique character found.");
    }
    
}
