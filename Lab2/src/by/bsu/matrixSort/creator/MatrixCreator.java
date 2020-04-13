package by.bsu.matrixSort.creator;
import by.bsu.matrixSort.entity.Matrix;
import by.bsu.matrixSort.exception.InRangeException;
import by.bsu.matrixSort.exception.MatrixException;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MatrixCreator {

    /**
     *
     * @param t matrix which we want fill
     * @param start - min number
     * @param end - max number
     */
    public static void fillRandomized(Matrix t, int start, int end) {
        int v = t.getVerticalSize();
        int h = t.getHorizontalSize();
        for(int i = 0; i < v; i++) {
            for(int j = 0; j < h; j++) {
                try {
                    double value = Math.random() * (end - start) + start;
                    t.setElement(i, j, value);
                } catch (MatrixException e) {
                    /* в данном случае exception невозможен, поэтому обработка отсутствует,
                     но try пишем, поскольку метод setElement имеет throws MatrixException */
                }
            }
        }
    }

    /**
     *
     * @param t matrix
     * @param input InputStream
     */
    public static void fillFromStream(Matrix t, InputStream input) {
        int v = t.getVerticalSize();
        int h = t.getHorizontalSize();
        for(int i = 0; i < v; i++) {
            for(int j = 0; j < h; j++) {
                try {
                    double value = oneDoubleRead(input);
                    t.setElement(i, j, value);
                } catch (MatrixException e) {
                    /* в данном случае exception невозможен, поэтому обработка отсутствует,
                     но try пишем, поскольку метод setElement имеет throws MatrixException */
                }
            }
        }
    }

    /**
     *
     * @param input InputStream
     * @return number which we get from inputStream
     */
    private static double oneDoubleRead(InputStream input) {
        double number = 0;
        Scanner con = new Scanner(input);
        boolean continueInput = true;
        do {
            try {
                System.out.print("Enter an double: ");
                number = con.nextDouble();
                System.out.println(
                        "The number entered is " + number);
                continueInput = false;
            } catch (InputMismatchException ex) {
                System.out.println("Try again. (" +
                        "Incorrect input: an double is required)");
                con.nextLine();
            }
        }
        while (continueInput);
        return number;
    }


}
