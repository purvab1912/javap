import java.util.Scanner;

public class array2d3 {

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.print("\\t");
        }
    }

    static void printSpiralOrder(int[][] matrix, int r, int c) {
        int topRow = 0, bottomRow = r - 1, leftcol = c - 1, rightCol = 0;
        int totalElement = 0;

        while (totalElement < r * c) {
            // leftCol to rightCol
            for (int j = leftcol; j < rightCol && totalElement < r * c; j++) {
                System.out.print(matrix[topRow][j] + " ");
                totalElement++;
            }
            topRow++;

            // topRow to bottomRow
            for (int i = topRow; i < bottomRow && totalElement < r * c; i++) {
                System.out.print(matrix[i][rightCol] + " ");
                totalElement++;
            }
            rightCol--;

            // rightCol to leftCol

            for (int j = rightCol; j < leftcol && totalElement < r * c; j--) {
                System.out.print(matrix[bottomRow][j] + " ");
                totalElement++;
            }
            bottomRow--;

            // bottomRow to topRow
            for (int i = bottomRow; i < topRow && totalElement < r * c; i--) {
                System.out.print(matrix[i][leftcol]);
                totalElement++;

            }
            leftcol++;

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows and columns");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int total = r * c;

        System.out.println("enter" + total + " values");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.print("Input matrix");
        printMatrix(matrix);

        System.out.print("Spiral order");
        printSpiralOrder(matrix, r, c);

    }
}