package pratikum5.Latihan4;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Matrix A
        System.out.print("input baris matrix A = ");
        int rowsA = scanner.nextInt();
        System.out.print("input kolom matrix A = ");
        int colsA = scanner.nextInt();
        int[][] matrixA = new int[rowsA][colsA];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                System.out.printf("input elemen matrix A [%d,%d] = ", i, j);
                matrixA[i][j] = scanner.nextInt();
            }
        }

        // Input Matrix B
        System.out.print("\ninput baris matrix B = ");
        int rowsB = scanner.nextInt();
        System.out.print("input kolom matrix B = ");
        int colsB = scanner.nextInt();
        int[][] matrixB = new int[rowsB][colsB];

        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.printf("input elemen matrix B [%d,%d] = ", i, j);
                matrixB[i][j] = scanner.nextInt();
            }
        }

        // Operasi Matrix
        System.out.println("\nHasil penjumlahan matrix A + B");
        int[][] sum = addMatrices(matrixA, matrixB);
        printMatrix(sum);

        System.out.println("\nHasil transpose matrix A");
        int[][] transpose = transposeMatrix(matrixA);
        printMatrix(transpose);

        System.out.println("\nHasil perkalian matrix A x B");
        int[][] product = multiplyMatrices(matrixA, matrixB);
        printMatrix(product);

        scanner.close();
    }

    // Method Penjumlahan Matrix
    public static int[][] addMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    // Method Perkalian Matrix
    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int colsB = b[0].length;
        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    // Method Transpose Matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    // Method untuk Menampilkan Matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}