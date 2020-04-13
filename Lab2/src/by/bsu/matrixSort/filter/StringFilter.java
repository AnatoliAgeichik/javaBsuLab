package by.bsu.matrixSort.filter;

import by.bsu.matrixSort.exception.MatrixException;

public class StringFilter {

    public static final String REGEX = "[-+]?\\d+";

    /**
     *
     * @param strings array strings
     * @return array strings in which strings which consist number
     */
    public int findNumber(String strings){
        int number=-1;
        //try {


            if (strings.matches(REGEX)) {
                number=Integer.valueOf(strings);
            }
//            else {
//
//                throw  new MatrixException("this is not integer number");
//            }
//        }
//        catch (MatrixException e){
//            System.out.println(e.getMessage());
//            System.exit(0);
//        }

        return number;
    }
}
