package by.bsu.lab3.filter;

public class StringFilter {

    public static final String REGEX = "[-+]?\\d+";
    public String[] findNumber(String[] strings){
        int counter = 0;

        for (String item : strings) {
            if (item.matches(REGEX)){
                counter++;
            }
        }
        String[] validStr = new String[counter];
        int i = 0;
        for (String numberString : strings) {
            if (numberString.matches(REGEX)){
                validStr[i++] = numberString;
            }
        }
        return validStr;
    }
}
