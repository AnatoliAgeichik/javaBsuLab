package by.bsu.lab3.main;
import by.bsu.lab3.filter.StringFilter;
import by.bsu.lab3.handler.FindMaxMin;
import by.bsu.lab3.creator.ArrayCreator;
import by.bsu.lab3.reader.ReadFromConsole;
import by.bsu.lab3.entity.LenghtNumb;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        ReadFromConsole readFromConsole=new ReadFromConsole();
//        String[] strings= readFromConsole.readStringArray(System.in);
//        StringFilter stringFilter=new StringFilter();
//        strings=stringFilter.findNumber(strings);
//        int [] arr;
//        ArrayCreator arrayCreator=new ArrayCreator();
//        arr=arrayCreator.factoryArray(strings);
//
//        FindMaxMin findMaxMin=new FindMaxMin();
//        LenghtNumb lenghtNumb=findMaxMin.findNumbMaxLenght(arr);
//        System.out.println(lenghtNumb.toString());
    LenghtNumb lenghtNumb=new LenghtNumb(56,153);
        System.out.println(lenghtNumb.toString());
        lenghtNumb.setLenght(55);
        System.out.println(lenghtNumb.toString());
        lenghtNumb.setElement(3,1235);
        System.out.println(lenghtNumb);


    }
}
