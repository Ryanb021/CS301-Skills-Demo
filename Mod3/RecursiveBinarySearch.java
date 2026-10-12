public class RecursiveBinarySearch {

    public static void main(String[] args) {

        // Create an array of sorted integers
        int[] numbers = { 3, 8, 12, 17, 21, 35, 48 };

        // Test method
        System.out.println(search(numbers, 17));
        System.out.println(search(numbers, 20));
    }

    public static boolean search(int[] numbers, int target) {
        return search(numbers, target, 0, numbers.length - 1);
    }

    // Recursive method to search the array
    public static boolean search(int[] numbers, int target, int left, int right) {

        // Base case - Stop if target is not found
        if (left > right) {
            return false;
        }

        // Find the middle index
        int middle = left + (right - left) / 2;

        // Check  if middle index is the target
        if (numbers[middle] == target) {
            return true;
        }

        // Search left side
        if (target < numbers[middle]) {
            return search(numbers, target, left, middle - 1);
        }

        // Search right side
        return search(numbers, target, middle + 1, right);

    }
}