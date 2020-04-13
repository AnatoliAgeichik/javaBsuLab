package by.bsu.lab4.handler;

import by.bsu.lab4.collection.Education;
import by.bsu.lab4.collection.Gender;
import by.bsu.lab4.entity.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

public class PersonHandlerStreamAPI {
    public List<Person> getOlderPeople(Person[] arr, int age){
        Calendar now = Calendar.getInstance();
        return Arrays.stream(arr).filter(s->(now.get(Calendar.YEAR)-s.getYearOfBirth())>age).collect(Collectors.toList());
    }
    public List<Person> getPeopleWithHighEducation(Person[] arr){
        Calendar now = Calendar.getInstance();
        return Arrays.stream(arr).filter(s->s.getEducation()== Education.HIGHER).collect(Collectors.toList());
    }
    public List<Person> getMen(Person[] arr){
        Calendar now = Calendar.getInstance();
        return Arrays.stream(arr).filter(s->s.getGender()== Gender.MALE).collect(Collectors.toList());
    }
}
