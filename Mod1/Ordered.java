public class Ordered {
    public static void main(String[] args) {

        // Get x, y, and z, from the command line
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);

        // Check if the numbers are in ascending order
        boolean b = (x < y && y < z) || (x > y && y > z);

        // Print true or false
        System.out.println(b);
    }
}