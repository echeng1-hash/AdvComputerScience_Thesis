public class LineTester {
    public static void main(String[] args) {
        // Testing Line 1
        Line line1 = new Line(5, 4, -17);
        double slope1 = line1.calculateSlope(); // slope1 should be -1.25
        System.out.println(slope1);

        // Should be true, as 5(5) + 4(-2) + (-17) = 0
        boolean onLine1 = line1.isCoordinateOnLine(5, -2);
        System.out.println(onLine1);

        // Testing Line 2
        Line line2 = new Line(-25, 40, 30);
        double slope2 = line2.calculateSlope(); // slope2 should be 0.625
        System.out.println(slope2);

        // Should be false as -25(5) + 40(-2) + 30 != 0
        boolean onLine2 = line2.isCoordinateOnLine(5, -2);
        System.out.println(onLine2);

        // Testing getA() and setA(). Should print 5, and then 2
        int line1A = line1.getA();
        System.out.println(line1A);
        line1.setA(2);
        line1A = line1.getA();
        System.out.println(line1A);

        // Testing getB() and setB(). Should print 4, and then 43
        int line1B = line1.getB();
        System.out.println(line1B);
        line1.setB(43);
        line1B = line1.getB();
        System.out.println(line1B);

        // Testing getC() and setC(). Should print -17, and then -14
        int line1C = line1.getC();
        System.out.println(line1C);
        line1.setC(-14);
        line1C = line1.getC();
        System.out.println(line1C);

        // Testing isParallel(Line original, Line other).
        // should say not parallel
        System.out.println(line1.isParallel(line1, line2));
        // should say parallel
        Line line3 = new Line(2, 43, 17);
        System.out.println(line3.isParallel(line3, line1));
        
        // Testing equals(Line other).
        // should be not equal
        System.out.println(line3.equals(line1));
        // should be equal
        Line line4 = new Line(2, 43, -14);
        System.out.println(line1.equals(line4));

        // Testing intersectionPoint(Line original, Line other).
        System.out.println(line2.intersectionPoint(line2, line3));
        
        // Testing Line(), which also confirms generateRandomParameters().
        Line defaultLine = new Line();
        System.out.println(defaultLine);
    }
}