package by.bsu.lab4.handler;

import by.bsu.lab4.collection.Education;
import by.bsu.lab4.collection.Gender;
import by.bsu.lab4.entity.Person;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class PersonHandler {
    public List<Person> getOlderPeople(Person[] arr, int age){
        List<Person> result =new ArrayList<Person>() ;
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        for (Person item: arr) {
            if(year-item.getYearOfBirth()>age){
                result.add(item);
            }
        }
        return result;
    }
    public List<Person> getPeopleWithHighEducation(Person[] arr){
        List<Person> result=new ArrayList<Person>();
        for (Person item:arr) {
            if(item.getEducation()== Education.HIGHER){
                result.add(item);
            }

        }
        return result;
    }
    public  List<Person> getMen(Person[] arr){
        List<Person> result=new ArrayList<Person>();
        for (Person item:arr) {
            if(item.getGender()== Gender.MALE){
                result.add(item);
            }

        }
        return result;

    }
}
