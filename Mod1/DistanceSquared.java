public class DistanceSquared {
    public static void main(String[] args) {

    // Get x and y from the command line
    int x = Integer.parseInt(args[0]);
    int y = Integer.parseInt(args[1]);

    // Calculate the distance squared
    int distanceSquared = x * x  + y * y;

    // Print the result
    System.out.println(distanceSquared);

    }
}
