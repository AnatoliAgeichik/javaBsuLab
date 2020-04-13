package by.bsu.lab5.main;

import by.bsu.lab5.entity.Time;
import by.bsu.lab5.exception.TimeException;
import by.bsu.lab5.handler.Handler;
import by.bsu.lab5.timeArithmetic.TimeArithmetic;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        try {
            List<Time> times=new ArrayList<>();

            Time time = new Time(22, 36, 36);
            Time time1 = new Time(0, 1340, 0);
            Time time2 = new Time(12, 45, 25);
            Time time3 = new Time(0, 1240, 0);
            Time time4 = new Time(2, 38, 25);
            times.add(time);
            times.add(time1);
            times.add(time2);
            times.add(time3);
            times.add(time4);
            Handler handler=new Handler();



            TimeArithmetic timeArithmetic=new TimeArithmetic();
            System.out.println(handler.timeAliquot100OfMidnight(times));

        }
        catch (TimeException e){
            System.out.println(e.getMessage());
        }
    }
}
