package by.bsu.lab5.timeArithmetic;

import by.bsu.lab5.entity.Time;
import by.bsu.lab5.exception.TimeException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TimeArithmeticTest {

    TimeArithmetic timeArithmetic=new TimeArithmetic();

    @Test()
    public void testAdd() throws TimeException {
        Time time1=new Time(11,15,18);
        Time time2=new Time(11,15,18);

        Time actial=timeArithmetic.add(time1,time2);
        Time expect=new Time(22,30,36);
        Assert.assertEquals(actial,expect);
    }

    @Test()
    public void testAdd2() throws TimeException {
        Time time1=new Time(11,15,42);
        Time time2=new Time(11,15,18);

        Time actial=timeArithmetic.add(time1,time2);
        Time expect=new Time(22,31,0);
        Assert.assertEquals(actial,expect);
    }

    @Test()
    public void testDifferen() throws TimeException {
        Time time1=new Time(0,1,17);
        Time time2=new Time(0,0,18);

        Time actial=timeArithmetic.difference(time1,time2);
        Time expect=new Time(0,0,59);
        Assert.assertEquals(actial,expect);
    }

    @Test()
    public void testmultiplyOnNumb() throws TimeException {
        Time time1=new Time(1,2,15);
        int numb=4;

        Time actial=timeArithmetic.multiplyOnNumber(time1,numb);
        Time expect=new Time(4,9,0);
        Assert.assertEquals(actial,expect);
    }

    @Test()
    public void testdivideOnNumb() throws TimeException {
        Time time1=new Time(4,9,0);
        int numb=4;

        Time actial=timeArithmetic.divideOnNumber(time1,numb);
        Time expect=new Time(1,2,15);
        Assert.assertEquals(actial,expect);
    }

    @Test()
    public void testadd100sec() throws TimeException {
        Time time1=new Time(1,2,15);


        Time actial=timeArithmetic.add100Sec(time1);
        Time expect=new Time(1,3,55);
        Assert.assertEquals(actial,expect);
    }




}
