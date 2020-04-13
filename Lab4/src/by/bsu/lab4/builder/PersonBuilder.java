package by.bsu.lab4.builder;

import by.bsu.lab4.collection.Education;
import by.bsu.lab4.collection.Gender;
import by.bsu.lab4.entity.Person;
import by.bsu.lab4.filter.StringFilter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Calendar;
import java.util.Scanner;
import java.util.logging.Filter;

public class PersonBuilder {
    private Logger log = LogManager.getLogger();
    public Person inputFromConsole(){
        int tmp=-1;

        Scanner sc = new Scanner(System.in);
        Person person =new Person();
        Calendar now = Calendar.getInstance();

        StringFilter filter =new StringFilter();
        System.out.println("enter first name");
        person.setFirstName(sc.nextLine());
        System.out.println("Enter last name");
        person.setLastName(sc.nextLine());
        System.out.println("Enter patromymic");
        person.setPatronymic(sc.nextLine());
        System.out.println("Enter adress");
        person.setAdress(sc.nextLine());
        System.out.println("Enter age:");
        while (tmp<=-1 || tmp>now.get(Calendar.YEAR)){
            System.out.println("year should be >=0 and < our year");
            tmp=filter.findNumber(sc.nextLine());

        }
        person.setYearOfBirth(tmp);
        try {
            System.out.println("Enter gender:");
            Gender gender = Gender.valueOf(sc.next().toUpperCase());

            person.setGender(gender);
        }
        catch (IllegalArgumentException e){
            log.error(e.getMessage());
            person.setGender(Gender.MALE);
        }
        try {
            System.out.println("Enter education:");
            Education education = Education.valueOf(sc.next().toUpperCase());

            person.setEducation(education);
        }
        catch (IllegalArgumentException e){
            log.error(e.getMessage());
            person.setEducation(Education.SECONDARY);
        }
        return person;
    }
}
