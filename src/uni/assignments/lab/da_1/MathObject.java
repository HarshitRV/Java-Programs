package src.uni.assignments.lab.da_1;

import java.util.Scanner;

public interface MathObject {
    MathObject add(MathObject obj);

    MathObject multiply(MathObject obj);
}

class Scaler implements MathObject {
    private double value;

    Scaler(double value) {
        this.value = value;
    }

    double getValue() {
        return value;
    }

    @Override
    public MathObject add(MathObject obj) {
        Scaler s = (Scaler) obj;
        return new Scaler(value + s.getValue());
    }

    @Override
    public MathObject multiply(MathObject obj) {
        Scaler s = (Scaler) obj;
        return new Scaler(value * s.getValue());
    }
}

class Vector implements MathObject {
    private double[] items;

    Vector(double[] items) {
        this.items = items;
    }

    int getSize() {
        return items.length;
    }

    double getItem(int index) throws IndexOutOfBoundsException {
        return items[index];
    }

    @Override
    public MathObject add(MathObject obj) {
        Vector v = (Vector) obj;
        if (getSize() != v.getSize()) {
            throw new IllegalArgumentException("Vectors should be of same size");
        }

        double[] sumVector = new double[getSize()];

        for (int i = 0; i < v.getSize(); i++) {
            sumVector[i] = items[i] + v.getItem(i);
        }

        return new Vector(sumVector);
    }

    @Override
    public MathObject multiply(MathObject obj) {
        Vector v = (Vector) obj;
        if (getSize() != v.getSize()) {
            throw new IllegalArgumentException("Vectors should be of same size");
        }

        double result = 0;
        for (int i = 0; i < getSize(); i++) {
            result += items[i] * v.getItem(i);
        }

        return new Scaler(result);
    }
}

class Matrix implements MathObject {
    private double[][] items;

    Matrix(double[][] items) {
        this.items = items;
    }

    int getNumRows() {
        return items.length;
    }

    int getNumColumns() {
        return items[0].length;
    }

    double getItem(int row, int col) {
        return items[row][col];
    }

    @Override
    public MathObject add(MathObject obj) {
        Matrix m = (Matrix) obj;
        if (getNumRows() != m.getNumRows() && getNumColumns() != m.getNumColumns()) {
            throw new IllegalArgumentException("Row and Column size of matrix must be same");
        }

        double[][] sumMatrix = new double[getNumRows()][getNumColumns()];

        for (int i = 0; i < getNumRows(); i++) {
            for (int j = 0; j < getNumColumns(); j++) {
                sumMatrix[i][j] = items[i][j] + m.getItem(i, j);
            }
        }
        return new Matrix(sumMatrix);
    }

    @Override
    public MathObject multiply(MathObject obj) {
        Matrix m = (Matrix) obj;

        if (getNumColumns() != m.getNumRows()) {
            throw new IllegalArgumentException(
                    "Number of columns in first matrix must be equal to number of rows in second matrix");
        }

        double[][] result = new double[getNumRows()][m.getNumColumns()];
        for (int i = 0; i < getNumRows(); i++) {
            for (int j = 0; j < m.getNumColumns(); j++) {
                double sum = 0;
                for (int k = 0; k < getNumColumns(); k++) {
                    sum += getItem(i, j) * m.getItem(k, j);
                }
                result[i][j] = sum;
            }
        }
        return new Matrix(result);
    }
}

/**
 * Driver class to test the vector and matrix
 */
class DriverMathematicalObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---- VECTOR ARITHMETIC ----");
        System.out.print("Enter size of vector: ");
        int size = sc.nextInt();

        double arr1[] = new double[size];
        double arr2[] = new double[size];

        System.out.println("Enter first vector items");
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = sc.nextDouble();
        }
        System.out.println("Enter second vector items");
        for(int i = 0; i < arr1.length; i++){
            arr2[i] = sc.nextDouble();
        }

        Vector v1 = new Vector(arr1);
        Vector v2 = new Vector(arr2);

        // Vector additon.
        Vector sumVector = (Vector) v1.add(v2);
        System.out.println("Sum of both vector");
        for (int i = 0; i < sumVector.getSize(); i++) {
            System.out.print(sumVector.getItem(i) + " ");
        }

        // Vector multiplication
        Scaler product = (Scaler) v1.multiply(v2);
        System.out.println("\nVector multiplication = " + product.getValue());

        // Testing matrix class
        System.out.println("\n---- MATRIX ARITHMETIC ----");
        System.out.println();
        System.out.print("Enter number of rows and columns: ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        double m1[][] = new double[rows][columns];
        double m2[][] = new double[rows][columns];

        System.out.println("Enter items for first matrix");
        for(int i = 0; i < m1.length; i++){
            for(int j = 0; j < m1[i].length; j++){
                m1[i][j] = sc.nextDouble();
            }
        }

        System.out.println("Enter items for second matrix");
        for(int i = 0; i < m2.length; i++){
            for(int j = 0; j < m2[i].length; j++){
                m2[i][j] = sc.nextDouble();
            }
        }

        Matrix matrix1 = new Matrix(m1);
        Matrix matrix2 = new Matrix(m2);

        Matrix sumMatrix = (Matrix) matrix1.add(matrix2);
        System.out.println("\nSum of two matrix");
        for (int i = 0; i < sumMatrix.getNumRows(); i++) {
            for (int j = 0; j < sumMatrix.getNumColumns(); j++) {
                System.out.print(sumMatrix.getItem(i, j) + " ");
            }
            System.out.println();
        }

        Matrix productMatrix = (Matrix) matrix1.multiply(matrix2);
        System.out.println("\nProduct of two matrix");
        for (int i = 0; i < productMatrix.getNumRows(); i++) {
            for (int j = 0; j < productMatrix.getNumColumns(); j++) {
                System.out.print(productMatrix.getItem(i, j) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}