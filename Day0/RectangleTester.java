public class RectangleTester {
    public static void main(String[] agrs) {

        // decoloration: type name; Instantiation/initialization = new type()
        Rectangle abc = new Rectangle(6, 2);
        Rectangle one = new Rectangle(8, 3);
        Rectangle two = new Rectangle(26, 11);
        Rectangle lil = new Rectangle(5);

        System.out.println("Testing getWidth: " + abc.getWidth());

        System.out.println("Testing getWidth: " + one.getWidth());

        // the way to test void methods is to check the variable before and after
        System.out.println("Testing setLength: Initially, length is " + abc.getLength());
        abc.setLength(22);
        System.out.println("Testing setLength: Finally, length is " + abc.getLength());

        System.out.println("Testing setWidth: Initially, length is " + one.getWidth());
        abc.setLength(12);
        System.out.println("Testing setLength: Finally, length is " + one.getWidth());

        System.out.println("Testing calculateArea: " + two.getArea());

        System.out.println("Testing calculatePerimeter: " + lil.getPerimeter());

        System.out.println("Testing calculateDiagonal: " + lil.getDiagonal());
    }
}
