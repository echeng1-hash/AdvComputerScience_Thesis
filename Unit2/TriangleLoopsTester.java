public class TriangleLoopsTester {
    public static void main(String[] args) {
        // to-do: create a separate tester class
        // to-do: invoke each method at least 2 times in the tester class

        // test creatLetterTriangleUp
        String output = TriangleLoops.createLetterTriangleUp(3, 'A');
        System.out.println(output);
        String output2 = TriangleLoops.createLetterTriangleUp(15, 'B');
        System.out.println(output2);

        // test createLetterTriangleDown
        System.out.println(TriangleLoops.createLetterTriangleDown(3, 'A'));
        System.out.println(TriangleLoops.createLetterTriangleDown(5, 'B'));

        // test createNumbersTriangle
        System.out.println(TriangleLoops.createNumbersTriangle(4));

        // test createAlphabetTriangle
        System.out.println(TriangleLoops.createAlphabetTriangle(5));
        System.out.println(TriangleLoops.createAlphabetTriangle(27));
    }
}