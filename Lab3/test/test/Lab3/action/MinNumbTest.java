package test.Lab3.action;

import org.testng.Assert;
import org.testng.annotations.Test;
import by.bsu.lab3.handler.FindMaxMin;
import by.bsu.lab3.entity.LenghtNumb;
import by.bsu.lab3.filter.StringFilter;
import java.io.IOException;
import by.bsu.lab3.creator.ArrayCreator;


public class MinNumbTest {
    @Test(expectedExceptions = IOException.class)
    public void isException() throws Exception {
        int[] arr=new int [0];
        FindMaxMin findMaxMin=new FindMaxMin();
        findMaxMin.findNumbMaxLenght(arr);

    }
    @Test()
    public void testCreator(){
        String[] strings=new String[5];
        strings[0]="15";
        strings[1]="16";
        strings[2]="18";
        strings[3]="14";
        strings[4]="55";
        ArrayCreator arrayCreator=new ArrayCreator();
        int arr[];
        arr=arrayCreator.factoryArray(strings);
        int actual=arr.length;
        int expected=strings.length;
        Assert.assertEquals(actual, expected);

    }
    @Test()
    public void testFiltre(){
        StringFilter filter=new StringFilter();
        String[] strings=new String[5];
        strings[0]="aa15";
        strings[1]="15";
        strings[2]="a1a5";
        strings[3]="15aa";
        strings[4]="aa";
        String arr[];
        arr=filter.findNumber(strings);
        int actual=arr.length;
        int expected=1;
        Assert.assertEquals(actual, expected);
    }

    @Test()
    public void testCreatorFalse(){
        String[] strings=new String[5];
        strings[0]="15";
        strings[1]="16";
        strings[2]="18";
        strings[3]="14";
        strings[4]="55";
        ArrayCreator arrayCreator=new ArrayCreator();
        int arr[];
        arr=arrayCreator.factoryArray(strings);
        int actual=arr.length;
        int expected=strings.length-1;
        Assert.assertNotEquals(actual, expected);

    }
    @Test()
    public void testFiltreFalse(){
        StringFilter filter=new StringFilter();
        String[] strings=new String[5];
        strings[0]="aa15";
        strings[1]="15";
        strings[2]="a1a5";
        strings[3]="15aa";
        strings[4]="aa";
        String arr[];
        arr=filter.findNumber(strings);
        int actual=arr.length;
        int expected=4;
        Assert.assertNotEquals(actual, expected);
    }


    @Test()
    public void minNumb(){
        int [] arr=new int[5];
        arr[0]=153;
        arr[1]=1553;
        arr[2]=53;
        arr[3]=15351;
        arr[4]=56153;
        FindMaxMin findMaxMin=new FindMaxMin();
        LenghtNumb lenghtNumb=findMaxMin.findNumbMinLenght(arr);
        int actual=lenghtNumb.getNumb();
        int expected=arr[2];
        Assert.assertEquals(actual, expected);
    }
    @Test()
    public void minLenght(){
        int [] arr=new int[5];
        arr[0]=153;
        arr[1]=1553;
        arr[2]=53;
        arr[3]=15351;
        arr[4]=56153;
        FindMaxMin findMaxMin=new FindMaxMin();
        LenghtNumb lenghtNumb=findMaxMin.findNumbMinLenght(arr);
        int actual=lenghtNumb.getLenght();
        int expected=(Integer.toString(arr[2])).length();
        Assert.assertEquals(actual, expected);
    }

    @Test()
    public void maxNumb() throws Exception {
        int [] arr=new int[5];
        arr[0]=153;
        arr[1]=1553;
        arr[2]=53;
        arr[3]=15351;
        arr[4]=56153;
        FindMaxMin findMaxMin=new FindMaxMin();
        LenghtNumb lenghtNumb=findMaxMin.findNumbMaxLenght(arr);
        int actual=lenghtNumb.getNumb();
        int expected=arr[3];
        Assert.assertEquals(actual, expected);
    }

    @Test()
    public void maxLenght() throws Exception {
        int [] arr=new int[5];
        arr[0]=153;
        arr[1]=1553;
        arr[2]=53;
        arr[3]=15351;
        arr[4]=56153;

        FindMaxMin findMaxMin=new FindMaxMin();
        LenghtNumb lenghtNumb=findMaxMin.findNumbMaxLenght(arr);
        int actual=lenghtNumb.getLenght();
        int expected=(Integer.toString(arr[3]).length());
        Assert.assertEquals(actual, expected);
    }
    @Test()
    public void minFalseNumb(){
        int [] arr=new int[5];
        arr[0]=153;
        arr[1]=1553;
        arr[2]=53;
        arr[3]=15351;
        arr[4]=56153;
        FindMaxMin findMaxMin=new FindMaxMin();
        LenghtNumb lenghtNumb=findMaxMin.findNumbMinLenght(arr);
        int actual=lenghtNumb.getNumb();
        int expected=arr[1];
        Assert.assertNotEquals(actual, expected);
    }
    @Test()
    public void minFalseLenght(){
        int [] arr=new int[5];
        arr[0]=153;
        arr[1]=1553;
        arr[2]=53;
        arr[3]=15351;
        arr[4]=56153;
        FindMaxMin findMaxMin=new FindMaxMin();
        LenghtNumb lenghtNumb=findMaxMin.findNumbMinLenght(arr);
        int actual=lenghtNumb.getLenght();
        int expected=(Integer.toString(arr[1])).length();
        Assert.assertNotEquals(actual , expected);
    }

    @Test()
    public void maxFalseNumb() throws Exception {
        int [] arr=new int[5];
        arr[0]=153;
        arr[1]=1553;
        arr[2]=53;
        arr[3]=15351;
        arr[4]=56153;
        FindMaxMin findMaxMin=new FindMaxMin();
        LenghtNumb lenghtNumb=findMaxMin.findNumbMaxLenght(arr);
        Assert.assertNotEquals(lenghtNumb.getNumb(),arr[2]);
    }

    @Test()
    public void maxFalseLenght() throws Exception {
        int [] arr=new int[5];
        arr[0]=153;
        arr[1]=1553;
        arr[2]=53;
        arr[3]=15351;
        arr[4]=56153;
        FindMaxMin findMaxMin=new FindMaxMin();
        LenghtNumb lenghtNumb=findMaxMin.findNumbMaxLenght(arr);
        int actual=lenghtNumb.getLenght();
        int expected=(Integer.toString(arr[2]).length());
        Assert.assertNotEquals(actual, expected);
    }

}
