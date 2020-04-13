package by.bsu.lab4.hadler;

import by.bsu.lab4.collection.Education;
import by.bsu.lab4.collection.Gender;
import by.bsu.lab4.entity.Person;
import by.bsu.lab4.handler.PersonHandler;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class PersonHandlerTest {

    Person[] people=new Person[3];

    @Test()
    public void testGetOlderPeople(){
        people[0]=new Person("a","a","a","a", Gender.MALE, Education.HIGHER,1985);
        people[1]=new Person("b","b","b","b", Gender.MALE, Education.HIGHER,1930);
        people[2]=new Person("c","c","c","c", Gender.MALE, Education.HIGHER,2010);

        int age=30;
        PersonHandler personHandler=new PersonHandler();
        List<Person> actual=new ArrayList<Person>();
        List<Person> expect=new ArrayList<Person>();
        actual=personHandler.getOlderPeople(people,age);
        expect.add(people[0]);
        expect.add(people[1]);
        Assert.assertEquals(actual,expect);

    }

    @Test()
    public  void testGetPeopleWithHigherEducation(){
        people[0]=new Person("a","a","a","a", Gender.MALE, Education.HIGHER,1985);
        people[1]=new Person("b","b","b","b", Gender.MALE, Education.PHD,1930);
        people[2]=new Person("c","c","c","c", Gender.MALE, Education.SECONDARY,2010);

        int age=30;
        PersonHandler personHandler=new PersonHandler();
        List<Person> actual=new ArrayList<Person>();
        List<Person> expect=new ArrayList<Person>();
        actual=personHandler.getPeopleWithHighEducation(people);
        expect.add(people[0]);
        Assert.assertEquals(actual,expect);

    }
    @Test()
    public void testGetMen(){
        people[0]=new Person("a","a","a","a", Gender.MALE, Education.HIGHER,1985);
        people[1]=new Person("b","b","b","b", Gender.FEMALE, Education.HIGHER,1930);
        people[2]=new Person("c","c","c","c", Gender.MALE, Education.HIGHER,2010);

        int age=30;
        PersonHandler personHandler=new PersonHandler();
        List<Person> actual=new ArrayList<Person>();
        List<Person> expect=new ArrayList<Person>();
        actual=personHandler.getMen(people);
        expect.add(people[0]);
        expect.add(people[2]);
        Assert.assertEquals(actual,expect);

    }
}
