package Java_cert;

import java.time.LocalDate;
import java.time.Month;

public class Question65 {
    public static void main(String[] args) {
        LocalDate valentinesDay = LocalDate.of(2015, Month.FEBRUARY, 14);
        LocalDate nextYear = valentinesDay.plusYears(1);
        nextYear.plusDays(15); //line n1
        System.out.println(nextYear);
    }
}

//Output is 2016-02-14

//Correct answer is A. 2016-02-14
//Explanation: This is a trick question. nextYear gets incremented with 15days but never gets printed. Dont get confused with option C. 2016-02-29