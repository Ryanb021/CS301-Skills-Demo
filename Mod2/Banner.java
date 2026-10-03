public class Banner {
    public static void main(String[] args) {

        // Get message
        String s = args[0];

        // Get the speed from the command line
        int speed = Integer.parseInt(args[1]);

        // Starting position
        double x = 0.0;

        // Keep banner moving
        while (true) {

            // Clear screen
            StdDraw.clear();

            // Draw the message
            StdDraw.text(x, 0.5, s);

            // Move the message to the right
            x = x + 0.01;

            // Wrap back to the left
            if (x > 1.0) {
                x = 0.0;
            }

            // Show the drawing
            StdDraw.show();

            // Control the speed
            StdDraw.pause(speed);
        }
    }
}

// Reference idea: https://introcs.cs.princeton.edu/java/15inout/Banner.java.html