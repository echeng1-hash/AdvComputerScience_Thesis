public class Rectangle extends Polygon {
    // instance variables
    private double length;
    private double width;

    // No-arg constructor
    public Rectangle() {
        super(4);
        this.length = 4;
        this.width = 3;
    }

    // Two-parameter constructor
    public Rectangle(double width, double length) {
        super(4);
        this.width = width;
        this.length = length;
    }

    // Getters and setters
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Methods
    public double getArea() {
        return length * width;
    }

    public String toString() {
        return super.toString()
                + "\nIt is a rectangle with a length of " + length
                + " and width of " + width + ". Its area is " + getArea() + ".";
    }
}
