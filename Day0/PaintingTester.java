public class PaintingTester {
    public static void main (String[] agrs) { // args = arguements
        System.out.println("Hello World!");
        Painting sevenBirds = new Painting();
        System.out.println(sevenBirds.toString());
        sevenBirds.broke();
        sevenBirds.viewed();
        System.out.println(sevenBirds.toString());
    }
}