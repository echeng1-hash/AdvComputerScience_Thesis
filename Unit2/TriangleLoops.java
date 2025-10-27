public class TriangleLoops {
    /*
     * The method returns a String by creating rows of letters. Each row prints a
     * number of letters equal to the row number. The total number of rows printed
     * is determined by numberOfRows.
     * @param numberOfRows the number of rows in the triangle
     * @param letter the letter to be printed
     * @return a String of letters in the shape of a triangle
     */

    // to-do: implement createLetterTriangleUp
    public static String createLetterTriangleUp(int numberOfRows, char letter) {
        String triangle = "";
        for (int row = 1; row <= numberOfRows; row++) {
            for (int k = 0; k < row; k++) {
                triangle += letter;
            }
            triangle += '\n';
        }
        return triangle;
    }

    /*
     * The method returns a String by creating rows of letters. Each row prints a
     * number of letters equal to the total number of rows, descending downward. The
     * total number of rows printed is determined by numberOfRows.
     * @param numberOfRows the number of rows in the triangle
     * @param letter the letter to be printed
     * @return a String of letters in the shape of a triangle
     */
    // to-do: implement createLetterTriangleDown
    public static String createLetterTriangleDown(int numberOfRows, char letter) {
        String triangle = "";
        for (int row = numberOfRows; row >= 1; row--) {
            for (int k = 0; k < row; k++) {
                triangle += letter;
            }
            if (row > 1) {
                triangle += '\n';
            }
        }
        return triangle;
    }

    /*
     * This method returns a String of a number triangle. The number of rows in the
     * triangle is determined by the numberOfRows, and the number used in each row
     * is determined by the row number.
     * @param numberOfRows the number of rows in the triangle
     * @return a String of numbers in the shape of a triangle
     */
    // to-do: implement createNumbersTriangle
    public static String createNumbersTriangle(int numberOfRows) {
        String triangle = "";
        for (int row = 1; row <= numberOfRows; row++) {
            for (int k = 1; k <= row; k++) {
                triangle += row; // print the row number
                if (k < row) {
                    triangle += ' ';
                }
            }
            if (row < numberOfRows) {
                triangle += '\n';
            }
        }
        return triangle;
    }

    /*
     * The method returns a String by creating a pyramid pattern using the alphabet.
     * The method determines the height of the pyramid by using the int
     * numberOfRows.
     * @param numberOfRows the number of rows in the triangle
     * @return a String of letters in the shape of a pyramid
     */
    // to-do: implement createAlphabetTriangle
    public static String createAlphabetTriangle(int numberOfRows) {
        String triangle = "";
        for (int row = 1; row <= numberOfRows; row++) { // row
            for (int s = 0; s < numberOfRows - row; s++) {
                triangle += ' '; // add spaces in front
            }    
            for (int i = 0; i < row; i++) { // ascending letters
                triangle += ((char) ('A' + i));
            }
            for (int i = row - 2; i >= 0; i--) { // descending letters
                triangle += ((char) ('A' + i));
            }
            if (row < numberOfRows) {
                triangle += '\n';
            }
        }
        return triangle;
    }

}