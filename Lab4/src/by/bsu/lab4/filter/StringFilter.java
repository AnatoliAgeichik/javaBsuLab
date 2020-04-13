package by.bsu.lab4.filter;

public class StringFilter {

    public static final String REGEX = "[-+]?\\d+";
    public int findNumber(String strings){
        int number=-1;
        //try {


        if (strings.matches(REGEX)) {
            number=Integer.valueOf(strings);
        }
        return number;
    }
}
