package by.bsu.lab1.creator;

public class ArrayCreator {
    public int[] factoryArray(String[] strings){
        int[] arr=new int[strings.length];
        for(int i=0;i<strings.length;i++){
            arr[i]=Integer.parseInt(strings[i]);
        }
        return arr;
    }
}
