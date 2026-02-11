public class Square extends Rectangle {
    // no instance variables
    // Constructors
    public Square(double sideLength) {
        super(sideLength, sideLength);
    }

    public Square() {
        super(4, 4);
    }

    // Method
    public String toString() {
        return super.toString() + "\nIt is also a square.";
    }
}
