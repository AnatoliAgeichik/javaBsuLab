package by.bsu.lab4.entity;

import by.bsu.lab4.collection.Education;
import by.bsu.lab4.collection.Gender;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Person implements Cloneable {
    private Logger log = LogManager.getLogger();

    private String firstName;
    private String lastName;
    private String patronymic;
    private String adress;
    private Gender gender;
    private Education education;
    private int yearOfBirth;

    public Person(){

    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", patronymic='").append(patronymic).append('\'');
        sb.append(", adress='").append(adress).append('\'');
        sb.append(", gender=").append(gender);
        sb.append(", education=").append(education);
        sb.append(", yearOfBirth=").append(yearOfBirth);
        sb.append('}');
        return sb.toString();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        log.info("set firstName");
    }

    public String getLastName() {
        return lastName;

    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        log.info("set lastName");

    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
        log.info("set patromymic");

    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
        log.info("set adress");

    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
        log.info("set gender");

    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
        log.info("set education");

    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
        log.info("set YearOfBirth");

    }

    public Person(String firstName, String lastName, String patronymic, String adress, Gender gender, Education education, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.adress = adress;
        this.gender = gender;
        this.education = education;
        this.yearOfBirth = yearOfBirth;
        log.info("person create");
    }

    public Person(String firstName, String lastName, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }
    public Person clone()throws CloneNotSupportedException{
        log.info("clone Person");
        return (Person)super.clone();
    }
}
