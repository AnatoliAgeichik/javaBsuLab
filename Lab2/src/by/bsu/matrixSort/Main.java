package by.bsu.matrixSort;

import by.bsu.matrixSort.creator.MatrixCreator;
import by.bsu.matrixSort.entity.Matrix;
import by.bsu.matrixSort.entity.User;
import by.bsu.matrixSort.exception.BadDateException;
import by.bsu.matrixSort.exception.InRangeException;
import by.bsu.matrixSort.exception.MatrixException;
import by.bsu.matrixSort.filter.StringFilter;
import by.bsu.matrixSort.reader.ReadFromConsole;
import by.bsu.matrixSort.sorting.SortMatrix;

import java.text.SimpleDateFormat;



public class Main {
    /**
     *
     * @param args
     * @throws MatrixException
     * @throws InRangeException
     */
    public static  void  main(String[] args) throws MatrixException, InRangeException {

        ReadFromConsole readFromConsole = new ReadFromConsole();
        System.out.println("Please enter count row");
        String string;
        StringFilter stringFilter=new StringFilter();

        int n=0;
        while(n<=0) {
            System.out.println("number must be integer");
            string=readFromConsole.readStringArray(System.in);
            n = stringFilter.findNumber(string);

        }
        System.out.println("Please enter count collumn");

        Matrix matr = new Matrix(n,n);
        MatrixCreator.fillRandomized(matr, -n, n);
        System.out.println(matr.toString());
        int m=-1;
        while (m<=0 || m>n){
            System.out.println("m should be >0 and <n");
            string=readFromConsole.readStringArray(System.in);
            m = stringFilter.findNumber(string);

        }
        System.out.println("1 - sorted line 2- sorted column");
        int t=0;
        while(t<=0 || t>2) {
            System.out.println("number must be integer");
            string=readFromConsole.readStringArray(System.in);
            t = stringFilter.findNumber(string);

        }


        switch (t){
            case (1):
                matr = SortMatrix.matrixSortedLine(matr, m);
                 break;
            case (2):
                matr=SortMatrix.matrixSortedColumn(matr, m);
                break;

        }
        System.out.println(matr.toString());

        try{
        User user = new User("Ageichik", 2020, 3, 10, 15, 30);
        System.out.println("Autor " + user.getName());
        System.out.print("The time of getting task: ");
        long getTaskTime = user.timeGettingTask();
        String taskStringDate = new SimpleDateFormat("dd MM yyyy HH:mm").format(getTaskTime);
        System.out.println(taskStringDate);

        System.out.print("The time of end of task: ");
        long currTime = user.timeFinishTask();
        String currStingTime = new SimpleDateFormat("dd MM yyyy HH:mm").format(currTime);
        System.out.println(currStingTime);
    }
        catch(    BadDateException e) {
        System.out.println(e.getMessage());
    }
    }
}
