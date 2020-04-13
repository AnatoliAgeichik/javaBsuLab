package by.bsu.matrixSort.reader;

import java.io.InputStream;
import java.util.Scanner;

public class ReadFromConsole {
    /**
     *
     * @param inputStream
     * @return stings arrays, which consist words, whcih was broken with helpful space
     */
    public String readStringArray(InputStream inputStream){
        Scanner scanner =new Scanner(inputStream);
        String line = scanner.nextLine();
        line = line.trim();
        return line;
    }
}
