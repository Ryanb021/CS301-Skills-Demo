public class TwentyFivePerLine {
    public static void main(String[] args) {

        // Loop through the numbers 1000 to 2000
        for (int i = 1000; i <= 2000; i++) {

            // Print each each number on the same
            System.out.print(i + " ");

            // Start a new line every after 25 numbers
            if ((i - 999) % 25 == 0) {
                System.out.println();
            }
        }
    }
}