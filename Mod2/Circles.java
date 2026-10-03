public class Circles {
    public static void main(String[] args) {

        // Read args
        int NumOfCircles = Integer.parseInt(args[0]);
        double blackProbability = Double.parseDouble(args[1]);
        double minRadius = Double.parseDouble(args[2]);
        double MaxRadius = Double.parseDouble(args[3]);

        // Draw circles
        for (int i = 0; i < NumOfCircles; i++) {

            // Random position
            double x = Math.random();
            double y = Math.random();

            // Random radius between min and max
            double radius = minRadius + Math.random() * (MaxRadius - minRadius);

            // Choose black or white
            if (Math.random() < blackProbability) {
                StdDraw.setPenColor(StdDraw.BLACK);

            } else {
                StdDraw.setPenColor((StdDraw.WHITE));
            }

            // Draw the circle
            StdDraw.filledCircle(x, y, radius);
        }
    }
}

// Reference idea: https://github.com/arjunkejriwal2310/Shapes-and-their-Properties/blob/main/Circle.java