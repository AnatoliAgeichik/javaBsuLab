package by.bsu.lab5.validTime;

import by.bsu.lab5.entity.Time;
import by.bsu.lab5.exception.TimeException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Stack;

public class TimeValidator {
    private final int secMax=60;
    private final int minMax=60;
    private final int hourMax=24;
    private Logger log = LogManager.getLogger();

    public Stack<Integer> correctFullTime(int hour, int minutes, int sec) throws TimeException {

        Stack<Integer> res=new Stack<>();
        try {
            if (hour < 0 || minutes < 0 || sec < 0) {
                throw new TimeException("time < 0");
            }


            if (sec > (secMax - 1)) {
                minutes += sec / secMax;
                sec = sec % (secMax);
            }
            if (minutes > (minMax - 1)) {
                hour += minutes / minMax;
                minutes = minutes % (minMax);
            }
            if (hour > (hourMax - 1)) {
                hour = hour % (hourMax);
            }
        }
        catch (TimeException e){
            log.error(e.getMessage());
            System.exit(0);
        }
        res.add(sec);
        res.add(minutes);
        res.add(hour);
        return res;
    }
    public Stack<Integer> correctMinutesTime(int hour, int minutes) throws TimeException {
        Stack<Integer> res = new Stack<>();

        try {
            if (hour < 0 || minutes < 0) {
                throw new TimeException("time < 0");
            }

            if (minutes > (minMax - 1)) {
                hour += minutes / minMax;
                minutes = minutes % (minMax);
            }
            if (hour > (hourMax - 1)) {
                hour = hour % (hourMax);
            }
        }
        catch (TimeException e){
            log.error(e.getMessage());
            System.exit(0);
        }
        res.push(minutes);
        res.push(hour);
        return res;
    }


    public int correctHourTime(int hour) {
        try {
            if (hour < 0) {
                throw new TimeException("hour <0");
            }

            if (hour > (hourMax - 1)) {
                hour = hour % (hourMax);
            }
        }
        catch (TimeException e){
            log.error(e.getMessage());
            System.exit(0);
        }
        return hour;
    }


}
