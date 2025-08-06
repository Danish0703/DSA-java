
public class spiral {

    public static void printSpiral(int mtrx[][]) {
        int startRow = 0, endRow = mtrx.length - 1;
        int startCol = 0, endCol = mtrx[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Print the first row
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(mtrx[startRow][i] + " ");
            }
            startRow++;

            // Print the last column
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(mtrx[i][endCol] + " ");
            }
            endCol--;

            // Print the last row if still in bounds
            if (startRow <= endRow) {
                for (int i = endCol; i >= startCol; i--) {
                    System.out.print(mtrx[endRow][i] + " ");
                }
                endRow--;
            }

            // Print the first column if still in bounds
            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    System.out.print(mtrx[i][startCol] + " ");
                }
                startCol++;
            }
        }
    }

    public static void main(String[] args) {
        int mtrx[][] = {{1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}};

        System.out.println("Spiral Order of the Matrix:");
        printSpiral(mtrx);
        System.out.println();

    }
}
