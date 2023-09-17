public class SpiralMatrix {

    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix.length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            // left

            for (int i = endRow - 1; i >= startRow; i--) {
                System.out.println(matrix[i][startCol] + " ");
            }
        }

    }

    public static void main(String[] args) {

        int matrix[][] = { { 1, 2, 4, 3, 5 },
                { 5, 8, 7, 3, 8 },
                { 4, 5, 8, 3, 5 },
                { 9, 7, 4, 9, 3 } };
    }
}
