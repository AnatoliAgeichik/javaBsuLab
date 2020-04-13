package by.bsu.lab4.reader;

import java.io.InputStream;
import java.util.Scanner;

public class ReadFromConsole {
    public String readStringArray(InputStream inputStream){
        Scanner scanner =new Scanner(inputStream);
        String line = scanner.nextLine();
        line = line.trim();
        return line;
    }
}
