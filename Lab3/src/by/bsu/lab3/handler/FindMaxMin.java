package by.bsu.lab3.handler;

import by.bsu.lab3.entity.LenghtNumb;

import java.io.IOException;
import java.util.HashMap;

public class FindMaxMin {

    public LenghtNumb findNumbMaxLenght(int [] arr) throws IOException {
        if (arr.length==0){
            throw new IOException();
        }
        int maxLenght=(Integer.toString(arr[0])).length();
        int maxNumb=arr[0];
        for (int i=1;i<arr.length;i++){
            if (maxLenght<(Integer.toString(arr[i])).length()){
                maxLenght=(Integer.toString(arr[i])).length();
                maxNumb=arr[i];
            }
        }

        return new LenghtNumb(maxLenght,maxNumb);

    }
    public LenghtNumb findNumbMinLenght(int[] arr){
        int minLenght=(Integer.toString(arr[0])).length();
        int minNumb=arr[0];
        for (int i=1;i<arr.length;i++){
            if(minLenght>(Integer.toString(arr[i])).length()){
                minLenght=(Integer.toString(arr[i])).length();
                minNumb=arr[i];
            }
        }
        return new LenghtNumb(minLenght,minNumb);


    }
}
