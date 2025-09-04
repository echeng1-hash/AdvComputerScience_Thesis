public class Rectangle {
    private int length;
    private int width;
    // (general default) constructor
    // constructors do not have return type
    // used to initialize the private instance variable
    public Rectangle() {
        length = 5;
        width = 8;
    }

    // defines the instance variable withe the local parameter
    public Rectangle (int desiredlength, int desiredwidth) {
        length = desiredlength;
        width = desiredwidth;
    }

    public Rectangle (int squarerestangle) {
        length = squarerestangle;
        width = squarerestangle;
    }

    // getter
    // public method within a class that is used to retrieve the value of a private instance variable of that class
    // "int" is the return type of method
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    // setter
    // type of method used within a class to set or update the value of an instance variable
    // always need an input
    // void = output nothing
    public void setLength(int newLength) {
        length = newLength;
    }

    public void setWidth(int newWidth) {
        width = newWidth;
    }

    //methods
    public int calculateArea() {
        int calculateArea = length * width; 
        return calculateArea;

    }

    public int calculatePerimeter() {
        int calculatePerimeter = 2 * (length + width); 
        return calculatePerimeter;
    }

    public double calculateDiagonal() {
        double calculateDiagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2)); 
        return calculateDiagonal;
    }
}
