public class MatrixFunTester {
    public static void main(String[] args) {
        MatrixFun mat = new MatrixFun();
        // for toString method
        System.out.println(mat);
        System.out.println(mat.toString());
        // for equals(MatrixFun) method
        MatrixFun mat2 = new MatrixFun();
        System.out.println(mat.equals(mat2));
        // for equals(int[][]) method
        int[][] mat3 = { { 1, 2, 3 }, { 4, 5, 6 } };
        System.out.println(mat.equals(mat3));
        // for replaceAll method
        int[][] start = {
                { 1, 1, 3 },
                { 4, 5, 6 },
                { 1, 1, 1 }
        };
        MatrixFun mat4 = new MatrixFun(start);
        System.out.println("Before replaceAll(1, 9):");
        System.out.println(mat4);
        mat4.replaceAll(1, 9);
        System.out.println("After replaceAll(1, 9):");
        System.out.println(mat4);
        // for swapRows method
        int[][] start2 = {
                { 1, 1, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        MatrixFun mat5 = new MatrixFun(start2);
        System.out.println("Before swapRow(0, 1):");
        System.out.println(mat5);
        mat5.swapRow(0, 1);
        System.out.println("After swapRow(0, 1):");
        System.out.println(mat5);
    }
}