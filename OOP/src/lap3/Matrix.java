package lap3;

import java.util.Random;
import java.util.Scanner;

public class Matrix {
    public static Random random = new Random();

    public static void createRandomMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }
    }

    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }
        return matrix;
    }

    public static double[][] createRandomMatrix1(int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextDouble(100);
            }
        }
        return matrix;
    }

    public static void print(int[][] matrix) {
        if (matrix == null) {
            System.out.println("Result is null!!!");
        } else {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println(" ");
            }
        }
    }

    public static void print(double[][] matrix) {
        if (matrix == null) {
            System.out.println("Matrix is null!!!");
        } else {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    System.out.print((double) Math.round(matrix[i][j] * 100) / 100 + " ");
                }
                System.out.println(" ");
            }
        }
    }

    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
        return (matrix1.length == matrix2.length) && (matrix2[0].length == matrix1[0].length);
    }

    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
        return (matrix1.length == matrix2.length) && (matrix2[0].length == matrix1[0].length);
    }

    public static boolean checkMultiplyMatrix(int[][] matrix1, int[][] matrix2) {
        return (matrix1[0].length == matrix2.length);
    }

    public static boolean checkMultiplyMatrix(double[][] matrix1, double[][] matrix2) {
        return (matrix1[0].length == matrix2.length);
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        if (matrix1 == null && matrix2 == null) {
            return null;
        }
        if (!(haveSameDimension(matrix1, matrix2))) {
            return null;
        } else {
            int[][] sumMatrix = new int[matrix1.length][matrix1[0].length];
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[0].length; j++) {
                    sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            return sumMatrix;
        }
    }

    public static double[][] add(double[][] matrix1, double[][] matrix2) {
        if (matrix1 == null && matrix2 == null) {
            return null;
        }
        if (!(haveSameDimension(matrix1, matrix2))) {
            return null;
        } else {
            double[][] sumMatrix = new double[matrix1.length][matrix1[0].length];
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[0].length; j++) {
                    sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            return sumMatrix;
        }
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        if (matrix1 == null && matrix2 == null) {
            return null;
        }
        if (!(haveSameDimension(matrix1, matrix2))) {
            return null;
        } else {
            int[][] resultMatrix = new int[matrix1.length][matrix1[0].length];
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[0].length; j++) {
                    resultMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
            return resultMatrix;
        }
    }

    public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
        if (matrix1 == null && matrix2 == null) {
            return null;
        }
        if (!(haveSameDimension(matrix1, matrix2))) {
            return null;
        } else {
            double[][] resultMatrix = new double[matrix1.length][matrix1[0].length];
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[0].length; j++) {
                    resultMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
            return resultMatrix;
        }
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        if (checkMultiplyMatrix(matrix1, matrix2)) {
            int[][] multiplyMatrix = new int[matrix1.length][matrix2[0].length];
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix2[0].length; j++) {
                    for (int k = 0; k < matrix1[0].length; k++) {
                        multiplyMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            return multiplyMatrix;
        } else {
            return null;
        }
    }

    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
        if (checkMultiplyMatrix(matrix1, matrix2)) {
            double[][] multiplyMatrix = new double[matrix1.length][matrix2[0].length];
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix2[0].length; j++) {
                    for (int k = 0; k < matrix1[0].length; k++) {
                        multiplyMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            return multiplyMatrix;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the row of matrix1: ");
        int rows1 = in.nextInt();
        System.out.print("Enter the column of matrix1: ");
        int cols1 = in.nextInt();
        System.out.print("Enter the row of matrix2: ");
        int rows2 = in.nextInt();
        System.out.print("Enter the column of matrix2: ");
        int cols2 = in.nextInt();
        System.out.println("### Integer Matrix:");
        int[][] matrix1 = createRandomMatrix(rows1, cols1);
        int[][] matrix2 = createRandomMatrix(rows2, cols2);
        System.out.println("The matrix 1: ");
        print(matrix1);
        System.out.println("The matrix 2: ");
        print(matrix2);
        System.out.println("Add two matrix: ");
        print(add(matrix1, matrix2));
        System.out.println("Subtract two matrix: ");
        print(subtract(matrix1, matrix2));
        System.out.println("Multiply two matrix: ");
        print(multiply(matrix1, matrix2));
        System.out.println(" ");

        System.out.println("### Double Matrix:");
        double[][] matrix3 = createRandomMatrix1(rows1, cols1);
        double[][] matrix4 = createRandomMatrix1(rows2, cols2);
        in.close();
        System.out.println("The matrix 1: ");
        print(matrix3);
        System.out.println("The matrix 2: ");
        print(matrix4);
        System.out.println("Add two matrix: ");
        print(add(matrix3, matrix4));
        System.out.println("Subtract two matrix: ");
        print(subtract(matrix3, matrix4));
        System.out.println("Multiply two matrix: ");
        print(multiply(matrix3, matrix4));
    }
}
