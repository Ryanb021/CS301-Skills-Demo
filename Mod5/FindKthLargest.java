
import java.util.Random;

public class FindKthLargest {

    public static void main(String[] args) {

        // Create an unsorted array
        int[] numbers = {7, 2, 9, 4, 1, 6};

        // Find the second largest number
        int k = 2;

        // Call the method
        int result = findKthLargest(numbers, k);

        // Display the answer
        System.out.println("Kth largest number: " + result);
    }

    // Method to find the kth largest number
    public static int findKthLargest(int[] a, int k) {

        // Check if k is valid
        if (k < 1 || k > a.length) {
            throw new IllegalArgumentException("Invalid k value");
        }

        // Randomly shuffle the array
        Random random = new Random();

        for (int i = a.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);

            // Swap two numbers
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

        // Starting and ending indexes
        int left = 0;
        int right = a.length - 1;

        // kth largest is at index length - k
        int target = a.length - k;

        // Continue searching
        while (left <= right) {

            // Choose the last number as pivot
            int pivot = a[right];
            int position = left;

            // Move smaller numbers to the left
            for (int i = left; i < right; i++) {

                if (a[i] < pivot) {

                    // Swap the numbers
                    int temp = a[i];
                    a[i] = a[position];
                    a[position] = temp;

                    position++;
                }
            }

            // Put the pivot in its correct position
            int temp = a[position];
            a[position] = a[right];
            a[right] = temp;

            // Check the pivot position
            if (position == target) {
                return a[position];
            }

            // Search the right side
            if (position < target) {
                left = position + 1;
            } else {
                // Search the left side
                right = position - 1;
            }
        }

        return -1;
    }
}
