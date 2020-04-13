package by.bsu.lab1.main;
import by.bsu.lab1.creator.ArrayCreator;
import by.bsu.lab1.filter.StringFilter;
import by.bsu.lab1.reader.ReadFromConsole;
import by.bsu.lab1.parity.ParityCheck;

import java.lang.reflect.Array;
import java.util.Arrays;


public class Main {
    public static void main(String[] args){
        ReadFromConsole readFromConsole=new ReadFromConsole();
        String[] strings= readFromConsole.readStringArray(System.in);
        StringFilter stringFilter=new StringFilter();
        strings=stringFilter.findNumber(strings);
        int [] arr;
        ArrayCreator arrayCreator=new ArrayCreator();
        arr=arrayCreator.factoryArray(strings);

        ParityCheck parityCheck=new ParityCheck();
        int[] evenNumber;
        evenNumber=parityCheck.findEvenNumber(arr);
        System.out.println("even numbers \n"+ Arrays.toString(evenNumber));
        int [] oddNumber;
        oddNumber=parityCheck.findOddNumber(arr);
        System.out.println("odd numbers \n"+ Arrays.toString(oddNumber));

    }
}
