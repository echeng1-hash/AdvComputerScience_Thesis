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
        system.out.printLn ("Equation: " + a + "x" + "+" 
                            + b + "y" + c + " = 0");
    }
    
    public boolean equals(Line other){
        
    }
    
    public int generateRandomParameters() {
        
    }
    
    public boolean isParallel(int a2, int b2, int c2) {
        
    }
    
    public double intersectionPoint(int a2, int b2, int c2) {
        
    }
}