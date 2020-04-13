package by.bsu.lab5.entity;

import by.bsu.lab5.exception.TimeException;
import by.bsu.lab5.validTime.TimeValidator;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Stack;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;
    private TimeValidator timeValidator=new TimeValidator();
    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours =timeValidator.correctHourTime(hours);
    }

    public Time(int hours) {
        this.hours = timeValidator.correctHourTime(hours);
        ;
    }

    public Time(int hours, int minutes) throws TimeException {
        Stack<Integer> tmp=timeValidator.correctMinutesTime(hours,minutes);

        this.hours = tmp.pop();
        this.minutes = tmp.pop();
    }

    public Time(int hours, int minutes, int seconds) throws TimeException {
        Stack<Integer> tmp =timeValidator.correctFullTime(hours,minutes,seconds);

        this.hours = tmp.pop();
        this.minutes = tmp.pop();
        this.seconds = tmp.pop();
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) throws TimeException {
        Stack<Integer> res=timeValidator.correctMinutesTime(this.getHours(),minutes);
        this.hours=res.pop();
        this.minutes = res.pop();
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) throws TimeException {
        Stack<Integer> res=timeValidator.correctFullTime(this.getHours(),this.getMinutes(),seconds);
        this.hours=res.pop();
        this.minutes=res.pop();
        this.seconds=res.pop();

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Time{");
        sb.append("hours=").append(hours);
        sb.append(", minutes=").append(minutes);
        sb.append(", seconds=").append(seconds);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return hours == time.hours &&
                minutes == time.minutes &&
                seconds == time.seconds;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hours, minutes, seconds);
    }
}
