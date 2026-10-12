public class Partition {
    public static void main(String[] args) {

        // Get N from command line
        int n = Integer.parseInt(args[0]);

        // Check if N is positive
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // Print all partitions of N
        partition(n, n, "");
    }

    // Recursive method to print out partitions
    public static void partition(int n, int max, String result) {

        // If n is zero, print completed partition
        if (n == 0) {
            System.out.println(result.trim());
            return;
        }

        // Try numbers from max down to 1
        for (int i = max; i >= 1; i--) {

            // Use only numbers that are not greater than n
            if (i <= n) {

                // Call the method again with the remaining number
                partition(n - i, i, result + i + " ");
            }
        }
    }
}
