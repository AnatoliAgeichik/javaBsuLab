package by.bsu.matrixSort.sorting;

import by.bsu.matrixSort.entity.Matrix;
import by.bsu.matrixSort.exception.InRangeException;
import by.bsu.matrixSort.exception.MatrixException;

import java.util.Arrays;

public class SortMatrix {
    /**
     *
     * @param matrix two-dimensional array
     //* @param col number  column to sort by
     * @return sorting array
     * @throws MatrixException
     * @throws InRangeException
   */

    public static Matrix matrixSortedColumn(Matrix matrix, int k) throws MatrixException{
        k=k-1;
        for(int i=0; i<matrix.getVerticalSize(); i++){
            for (int j = 0; j < matrix.getVerticalSize()-1; j++) {
                if(matrix.getElement(j , k) > matrix.getElement(j + 1, k)) {
                    for( int p=0; p < matrix.getVerticalSize(); p++ ) {
                        double numb = matrix.getElement(j + 1, p);
                        matrix.setElement(j + 1, p, matrix.getElement(j, p));
                        matrix.setElement(j, p, numb);
                    }
                }
            }
        }
        return matrix;
    }

    public static Matrix matrixSortedLine(Matrix matrix, int k) throws MatrixException{
        k=k-1;
        for(int i=0; i<matrix.getVerticalSize(); i++){
            for (int j = 0; j < matrix.getVerticalSize()-1; j++) {
                if(matrix.getElement(k, j) > matrix.getElement(k,j + 1)) {
                    for( int p=0; p < matrix.getVerticalSize(); p++ ) {
                        double numb = matrix.getElement(p, j + 1);
                        matrix.setElement(p, j + 1, matrix.getElement(p, j));
                        matrix.setElement(p, j, numb);
                    }
                }
            }
        }
        return matrix;
    }


}
