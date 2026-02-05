public class SkyView {
    // Instance variable
    private double[][] view;

    // Constructor
    public SkyView(int numberOfRows, int numberOfCols, double[] scanned) {
        // required checks
        if (scanned == null) {
            throw new IllegalArgumentException("scanned is null");
        }
        if (scanned.length != numberOfRows * numberOfCols) {
            throw new IllegalArgumentException("wrong scanned length");
        }
        view = new double[numberOfRows][numberOfCols];
        int index = 0;
        for (int row = 0; row < numberOfRows; row++) {
            // even row: left to right
            if (row % 2 == 0) {
                for (int col = 0; col < numberOfCols; col++) {
                    view[row][col] = scanned[index];
                    index++;
                }
            } else { // odd row: right to left
                for (int col = numberOfCols - 1; col >= 0; col--) {
                    view[row][col] = scanned[index];
                    index++;
                }
            }
        }
    }

    // Getter and Setter
    public double[][] getView() {
        return view;
    }

    public void setView(double[][] view) {
        this.view = view;
    }

    // Methods
    public String toString() {
        String result = "";

        for (int row = 0; row < view.length; row++) {
            for (int col = 0; col < view[row].length; col++) {
                result += view[row][col] + " ";
            }
            result += "\n";
        }

        return result;
    }

    public boolean equals(SkyView other) {
        if (other == null) {
            return false;
        }
        // check rows
        if (this.view.length != other.view.length) {
            return false;
        }
        // check each row length + value
        for (int row = 0; row < this.view.length; row++) {
            if (this.view[row].length != other.view[row].length) {
                // checks columns in that specific row
                return false;
            }
            for (int col = 0; col < this.view[row].length; col++) {
                if (this.view[row][col] != other.view[row][col]) {
                    return false;
                }
            }
        }
        return true;
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol) {
        double sum = 0.0;
        int count = 0;
        for (int row = startRow; row <= endRow; row++) {
            for (int col = startCol; col <= endCol; col++) {
                sum += view[row][col];
                count++;
            }
        }
        return sum / count;
    }
}
