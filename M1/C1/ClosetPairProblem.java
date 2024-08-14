package module1;

import java.util.List;
import java.util.ArrayList;

// Define a class Point with methods to calculate distance
class Point {
    int x, y;

    // Constructor to initialize point coordinates
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to calculate the Euclidean distance between this point and another point
    public double distanceTo(Point other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }
}

public class ClosetPairProblem {

    // Method to find the minimum distance between points
    public static double minimumDistance(List<Point> allPoints) {
        double minDistance = Double.MAX_VALUE; // Initialize to maximum value
        
        // Compare each pair of points using enhanced for loops
        for (Point p1 : allPoints) {
            for (Point p2 : allPoints) {
                // Skip comparison if p1 and p2 are the same point
                if (p1 == p2) continue;

                double d = p1.distanceTo(p2);

                // Update minDistance if a smaller distance is found
                if (d < minDistance) {
                    minDistance = d;
                }
            }
        }

        return minDistance;
    }

    public static void main(String[] args) {
        // Create a list of points
        List<Point> points = new ArrayList<>();
        points.add(new Point(1, 1));
        points.add(new Point(4, 5));
        points.add(new Point(9, 6));
        points.add(new Point(12, 10));

        // Calculate and print the minimum distance
        double minDist = minimumDistance(points);
        System.out.println("The minimum distance between points is: " + minDist);
    }
}
