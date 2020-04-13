package by.bsu.lab1.parity;

public class ParityCheck {
    public int[] findEvenNumber(int[] arr){
        int countEvenNumber=0;
        for(int item:arr){
            if ((item%2)==0){
                countEvenNumber++;
            }
        }
        int [] evenNumbers=new int[countEvenNumber];
        for (int item:arr) {
            if((item%2)==0){
                evenNumbers[--countEvenNumber]=item;
            }
        }

        return evenNumbers;
    }
    public int[] findOddNumber(int[] arr){
        int countOddNumber=0;
        for(int item:arr){
            if ((item%2)==1){
                countOddNumber++;
            }
        }
        int [] oddNumbers=new int[countOddNumber];
        for (int item:arr) {
            if((item%2)==1){
                oddNumbers[--countOddNumber]=item;
            }
        }

        return oddNumbers;
    }
}
