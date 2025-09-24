public class Line {
    private int a;
    private int b;
    private int c;
    
    // Constructor (3-parameter)
    public Line(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // default constructor
    public Line() {
        this.a = generateRandomParameters();
        this.b = generateRandomParameters();
        this.c =  (int) ((Math.random()) * 41) - 20;
    }
    
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    public double calculateSlope() {
        // Cast to double
        return -1.0 * a / b;
    }
    
    public boolean isCoordinateOnLine(int x, int y) {
        // Using int b/c "0" is an int
        int value = a * x + b * y + c;
        return value == 0;
    }
    
    public String toString() {
        return "Equation: " + a + "x" + "+" 
                + b + "y+" + c + " = 0";
    }
    
    public boolean equals(Line other) { // Compares ALL instance variables for equality
        if (this.a == other.a && this.b == other.b && this.c == other.c) {
            return true;
        } else {
            return false;
        }
    }
    
    public int generateRandomParameters() {
        // -20 to 20
        int x = (int) ((Math.random()) * 41) - 20;
        if (x >= 0) {
            x += 1;
        }
        return x;
    }
    
    public boolean isParallel(Line original, Line other) {
        // cross-multiplyz: a1/b1 == a2/b2  ->  a1*b2 == a2*b1
        return a * other.b == other.a * b;
    }
    
    public String intersectionPoint(Line original, Line other) {
        if (isParallel(original, other)) {
            return "No intersection points.";
        } else { // isolate "y" to get "x", then plug "x" back in the equation to get "y"
            int det = a * other.b - other.a * b; // denominator
            int numOfX = b * other.c - other.b * c; // numerators
            int numOfY = other.a * c - a * other.c;
            double x = (double) numOfX / det; // divide as double
            double y = (double) numOfY / det;
            return "(" + x + "," + y + ")";
        }
    }
}