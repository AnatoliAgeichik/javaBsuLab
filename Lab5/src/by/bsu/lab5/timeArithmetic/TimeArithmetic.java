package by.bsu.lab5.timeArithmetic;

import by.bsu.lab5.entity.Time;
import by.bsu.lab5.exception.TimeException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TimeArithmetic {
    private Logger log = LogManager.getLogger();

    public int getTimeInSeconds(Time time){
        return time.getSeconds()+time.getMinutes()*60+time.getHours()*3600;
    }

    public int getTimeInMinutes(Time time){
        return time.getHours()*60+time.getMinutes();
    }

    public Time add(Time time1, Time time2) throws TimeException {
        return new Time(time1.getHours()+time2.getHours(),
                        time1.getMinutes()+time2.getMinutes(),
                        time1.getSeconds()+time2.getSeconds());
    }

    public Time difference(Time time1, Time time2) throws TimeException {
        int time1Sec=getTimeInSeconds(time1);
        int time2Sec=getTimeInSeconds(time2);

        return new Time(0,0,time1Sec-time2Sec);

    }

    public  Time multiplyOnNumber(Time time, int numb) throws TimeException {
        return new  Time(time.getHours()*numb,
                time.getMinutes()*numb,
                time.getSeconds()*numb);

    }

    public Time divideOnNumber(Time time, int numb) throws TimeException {

        int tmp=0;
        try {
            if (numb == 0) {
                throw new TimeException("divide zero");
            }

            tmp = getTimeInSeconds(time);
            tmp /= numb;

        }
        catch (TimeException e){
            log.error(e.getMessage());
            System.exit(0);
        }
        return new Time(0, 0, tmp);
    }

    public int minutesToMidnight(Time time){
        final int minutesMidnigh=24*60;
        return minutesMidnigh-getTimeInMinutes(time);
    }
    public Time add100Sec(Time time) throws TimeException {
       return new Time(time.getHours(),time.getMinutes(),time.getSeconds()+100);
    }


}
