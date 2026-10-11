public class AreTriangular {

    public static void main(String[] args) {

        // Test the method with different sides
        System.out.println(areTriangular(3, 4, 5));
        System.out.println(areTriangular(1, 2, 3));
        System.out.println(areTriangular(5, 5, 5));
    }

    public static boolean areTriangular(double a, double b, double c) {

        // All sides must be positive and each side must be less than the sum of the other two
        return a > 0 && b > 0 && c > 0
                && a < b + c
                && b < a + c
                && c < a + b;
    }
}
