
// 5000 out of 20000 is 25%
import java.util.Arrays;

public class SAT {
    public static void main(String[] args) {

        // Total number of applicants
        int students = 20000;

        // Number of students admitted
        int accepted = 5000;

        // Average SAT score
        int mean = 1200;

        // Standard deviation
        int standardDeviation = 100;

        // Create an array to store SAT scores
        int[] scores = new int[students];

        // Generate sat scores for 2000 students
        for (int i = 0; i < students; i++) {

            // Start with zero
            double randomNumber = 0;

            //Add 12 random numbers
            for (int j = 0; j < 12; j++) {
                randomNumber += Math.random();
            }

            // Subtract 6 to center result around zero
            randomNumber = randomNumber - 6;

            // Calculate student's SAT score
            scores[i] = (int) Math.round(mean + standardDeviation * randomNumber);
        }

        // Sort scores from lowest to highest
        Arrays.sort(scores);

        // Find the lowest score ammong accepted students
        int lowestScore = scores[students - accepted];

        // Print the result
        System.out.println("Estimated lowest SAT score: " + lowestScore);
    }
}
