public class ROT13 {
    public static void main(String[] args) {
        
        // Get string from command line
        String text = args[0];

        // Store the encooded message
        String result = "";

        // Go through each character
        for (int i = 0; i < text.length(); i++) {

            // Get the current character
            char letter = text.charAt(i);

            // Check for lowercase letters
            if (letter >= 'a' && letter <= 'z') {

                //Shift the lowercase by 13
                letter = (char) ('a' + (letter - 'a' + 13) % 26);

            // Check for uppercase letters
            } else if (letter >= 'A' && letter <= 'Z') {

                // Shift the uppercase by 13
                letter = (char) ('A' + (letter - 'A' + 13) % 26);
            }

            // Add character to result
            result = result + letter;
        }

        // Print the message
        System.out.println(result);
    }    
}
