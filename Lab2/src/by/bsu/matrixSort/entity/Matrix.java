package by.bsu.matrixSort.entity;

import by.bsu.matrixSort.exception.InRangeException;
import by.bsu.matrixSort.exception.MatrixException;

import java.util.Arrays;

/**
 * The type Matrix.
 */
public class Matrix {

    private double[ ][ ] a;

    /**
     * Instantiates a new Matrix.
     *
     * @param a two-demencional array
     */
    public Matrix(double[][] a) {
        this.a = Arrays.copyOf(a,a.length);
    }

    /**
     * Instantiates a new Matrix.
     *
     * @param n -count row of matrix
     * @param m count col of matrix
     * @throws MatrixException the matrix exception
     */
    public Matrix(int n, int m) throws MatrixException {
        // проверка на отрицательные значения размерности матрицы
        if ((n < 1) || (m < 1)) {
            throw new MatrixException();
        }
        a = new double[n][m];
    }

    /**
     * Get a double [ ] [ ].
     *
     * @return matrix double [ ] [ ]
     */
    public double[][] getA() {
        return a;
    }

    /**
     * Gets vertical size.
     *
     * @return vetical size our matix
     */
    public int getVerticalSize() {
        return a.length;
    }

    /**
     * Gets horizontal size.
     *
     * @return horizontal size our matix
     */
    public int getHorizontalSize() {
        return a[0].length;
    }

    /**
     * Get horizontal line double [ ].
     *
     * @param i number horizontal line, which we want get
     * @return verical line with i number
     * @throws InRangeException the in range exception
     */
    public double[] getHorizontalLine(int i)throws InRangeException {
        if((i<0)||(i>=a[0].length)){
            throw new InRangeException();
        }
        return a[i];
    }

    /**
     * Gets element.
     *
     * @param i number horizontal line, which we want get
     * @param j number vertical line, which we want get
     * @return elements of matrix with number i j
     * @throws MatrixException the matrix exception
     */
    public double getElement(int i, int j) throws MatrixException {
        if (checkRange(i, j)) {
            return a[i][j];
        }
        throw new MatrixException();
    }

    /**
     * Sets element.
     *
     * @param i     number horizontal line, which we want get
     * @param j     number vertical line, which we want get
     * @param value the value
     * @throws MatrixException the matrix exception
     */
    public void setElement(int i, int j, double value) throws MatrixException {
        if (checkRange(i, j)) {
            a[i][j] = value;
        }
        else {
            throw new MatrixException();
        }
    }
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("\nMatrix : " + a.length + "x" + a[0].length + "\n");
        for (double [ ] row : a) {
            for (double value : row) {
                //s.append(value + " ");
                s.append(String.format("%6.2f",value));
            }
            s.append("\n");
        }
        return s.toString();
    }

    /**
     *
     * @param i  number horizontal line, which we want check
     * @param j number verical line, which we want check
     * @return resault
     */
    // проверка возможности выхода за пределы матрицы
    private boolean checkRange(int i, int j) {
        if ( i >= 0 && i < a.length && j >= 0 && j < a[0].length ) {
            return true;
        } else {
            return false;
        }
    }
}
