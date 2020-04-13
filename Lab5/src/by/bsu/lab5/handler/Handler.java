package by.bsu.lab5.handler;

import by.bsu.lab5.entity.Time;
import by.bsu.lab5.timeArithmetic.TimeArithmetic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Handler {
    public List<Time> timeAliquot100OfMidnight (List<Time> times){
        List<Time> res=new ArrayList<>();
        TimeArithmetic timeArithmetic=new TimeArithmetic();
        return times.stream()
                .filter(o->((timeArithmetic.minutesToMidnight(o)*60+o.getSeconds())%100)==0)
                .collect(Collectors.toList());
    }

}
