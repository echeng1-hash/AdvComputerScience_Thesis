public class MatrixFun {
    private int[][] matrix;

    // Constructors
    public MatrixFun() {
        this(3, 3);
    }

    public MatrixFun(int numberOfRows, int numberOfCols) {
        // if rows is not positive, throw an IllegalArgumentException.
        if (numberOfRows <= 0 || numberOfCols <= 0) {
            throw new IllegalArgumentException("Invalid dimensions.");
        }
        matrix = new int[numberOfRows][numberOfCols];
        fillWithRandomNumbers();
    }

    public MatrixFun(int[][] starterMatrix) {
        matrix = starterMatrix;
        checkRectangular();
    }

    private void fillWithRandomNumbers() {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = (int) (Math.random() * 10); // 0-9
            }
        }
    }

    private void checkRectangular() {
        if (matrix == null || matrix.length == 0) {
            return;
        }
        int firstRowLength = matrix[0].length;
        for (int row = 0; row < matrix.length; row++) {
            if (matrix[row].length != firstRowLength) {
                System.out.println("This is a warning that starterMatrix is not rectangular.");
                return;
            }
        }
    }

    // Getters and Setters
    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    // Methods
    public String toString() {
        String result = "";
        // top border: for loop; number of "=" matches the visible length of the first
        // row
        int cols = matrix[0].length;
        String border = "";
        for (int i = 0; i < cols * 2; i++) {
            border += "=";
        }
        result += border + "\n";
        // Matrix rows (last number ALSO has a space)
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                result += matrix[row][col] + " ";
            }
            result += "\n";
        }
        result += border + "\n"; // newline at the end
        return result;
    }

    public boolean equals(MatrixFun other) {
        // if (other == null) {
        // return false;
        // }
        return this.toString().equals(other.toString());
    }

    public boolean equals(int[][] otherMatrix) {
        // if (otherMatrix == null) {
        // return false;
        // }
        // check same number of rows
        if (otherMatrix.length != matrix.length) {
            return false;
        }
        // check each row length and each value
        for (int row = 0; row < matrix.length; row++) {
            if (otherMatrix[row].length != matrix[row].length) {
                return false;
            }
            for (int col = 0; col < matrix[row].length; col++) {
                if (otherMatrix[row][col] != matrix[row][col]) {
                    return false;
                }
            }
        }
        return true;
    }

    public void replaceAll(int oldValue, int newValue) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == oldValue) {
                    matrix[row][col] = newValue;
                }
            }
        }
    }

    public void swapRow(int rowA, int rowB) {
        // check for valid row and column indices
        if (rowA < 0 || rowA >= matrix.length || rowB < 0 || rowB >= matrix.length) {
            throw new IllegalArgumentException("Invalid row index.");
        }
        int[] temp = matrix[rowA];
        matrix[rowA] = matrix[rowB];
        matrix[rowB] = temp;
    }
}
