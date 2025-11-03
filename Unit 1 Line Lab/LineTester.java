public class LineTester {
    public static void main(String[] args) {
        // instantiate four point object
        Point p1 = new Point(2, 7);
        Point p2 = new Point(1, 4);
        Point p3 = new Point(11, 18);
        Point p4 = new Point(4, 13);

        Line pointLine = new Line(p1, p2);
        // Print out the slope
        System.out.println("Using calculateSlope(): " + pointLine.calculateSlope());
        System.out.println("Using calculateSlope(): " + pointLine.calculateSlopeFromPoints());
        // Compare whether the slopes are the same
        if (pointLine.calculateSlope() == pointLine.calculateSlopeFromPoints()) {
            System.out.println("The slopes calculated by the two methods are the same.");
        } else {
            System.out.println("Oops, the slopes are not the same, something needs to be fixed.");
        }

        // Use the isCoordinateOnLine() method on all four points
        // to check whether they lie on pointLine.
        System.out.println("Is p1 on the line? " + pointLine.isCoordinateOnLine(p1)); // expect T
        System.out.println("Is p2 on the line? " + pointLine.isCoordinateOnLine(p2)); // expect T
        System.out.println("Is p3 on the line? " + pointLine.isCoordinateOnLine(p3)); // expect F
        System.out.println("Is p4 on the line? " + pointLine.isCoordinateOnLine(p4)); // expect T
    }
}