public class BinarySearch {

    public static void main(String[] args) {
        
        // Sorted array of integers
        int[] a = {-3, -1, 1, 3, 5, 7};

        // Call the search method
        int result = search(a);

        // Display the result
        if (result == -1) {
            System.out.println("No matching index found.");
        } else {
            System.out.println("Matching index: " + result);
        }
    }

    // Method to find an index where a[i] == i
    public static int search(int[] a) {
        int left = 0;
        int right = a.length - 1;

        // Keep searching while range is valid
        while (left <= right) {
            
            // Find the middle index
            int middle = left + (right - left) / 2;

            // Check if the value is equals its index
            if (a[middle] == middle) {
                return middle;
            }

            // If the value is too small, search right
            if(a[middle] < middle) {
                left = middle + 1;
            
            } else {
                // Otherwise search left
                right = middle -1;
            }
        }

        // Return -1 if no matchingindex exists
        return -1;
    }
}