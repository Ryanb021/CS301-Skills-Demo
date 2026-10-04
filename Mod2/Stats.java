public class Stats {
    public static void main(String[] args) {

        // get values from command line
        int n = Integer.parseInt(args[0]);

        // Create array to store numbers
        double[] numbers = new double[n];

        // Get sum of all numbers
        double sum = 0.0;

        // For loop to go through all numbers
        for (int i = 0; i < n; i++) {
            // Read a number and store in an array
            numbers[i] = StdIn.readDouble();

            // Add number to total
            sum = sum + numbers[i];
        }

        // Calculate the mean
        double mean = sum / n;

        // Calculate squared difference
        // Track squared difference
        double squaredDifference = 0.0;

        // For loop to go through numbers
        for (int i = 0; i < n; i++) {

            // Find the difference between number and mean
            double difference = numbers[i] - mean;

            // Find the squared difference
            squaredDifference = squaredDifference + difference * difference;
        }

        // Calculate standard deviation
        double standardDeviation = Math.sqrt(squaredDifference / (n - 1));

        System.out.println("Mean: " + mean);
        System.out.println("Sample Standard Deviation: " + standardDeviation);

    }
}

// Reference idea:
// https://stackoverflow.com/questions/1735870/simple-statistics-java-packages-for-calculating-mean-standard-deviation-etc
// https://www.baeldung.com/java-calculate-standard-deviation
// https://introcs.cs.princeton.edu/java/15inout/Stats.java.html