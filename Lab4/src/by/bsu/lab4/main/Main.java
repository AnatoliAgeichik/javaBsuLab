package by.bsu.lab4.main;

import by.bsu.lab4.builder.PersonBuilder;
import by.bsu.lab4.entity.Person;
import by.bsu.lab4.handler.PersonHandler;
import by.bsu.lab4.handler.PersonHandlerStreamAPI;
import by.bsu.lab4.reader.ReadFromConsole;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        //Person person =new Person();
        PersonBuilder personBuilder=new PersonBuilder();
        //person=personBuilder.inputFromConsole();
        //System.out.println(person.toString());
        int n=3;
        Person[] people=new Person[n];
        for (int i=0;i<n;i++){
            people[i]=personBuilder.inputFromConsole();
        }
        PersonHandlerStreamAPI personHandlerStreamAPI=new PersonHandlerStreamAPI();
        List<Person> arr=new ArrayList<Person>();
        arr=personHandlerStreamAPI.getOlderPeople(people,60);
        System.out.println(arr.toString());

    }
}
