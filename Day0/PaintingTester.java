public class PaintingTester {
    public static void main (String[] agrs) { // args = arguements
        System.out.println("Hello World!");
        Painting sevenBirds = new Painting();
        System.out.println(sevenBirds.toString());
        sevenBirds.broke();
        sevenBirds.viewed();
        System.out.println(sevenBirds.toString());
        
        Painting numberAPaint = new Painting();
        Painting numberBPaint = new Painting();

        if (numberAPaint.equals(numberBPaint)) {
            System.out.println("They are equal.");
        } else {
            System.out.println("They are not equal.");
        }
    }
}