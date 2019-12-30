package Java_cert;

import java.time.LocalDate;

public class Question116 {
    public static void main(String[] args) {
        LocalDate date= LocalDate.of(2012,01,32);
        date.plusDays(10);
        System.out.println(date);

    }

}


/*
Exception in thread "main" java.time.DateTimeException: Invalid value for DayOfMonth (valid values 1 - 28/31): 32
	at java.time.temporal.ValueRange.checkValidValue(ValueRange.java:311)
	at java.time.temporal.ChronoField.checkValidValue(ChronoField.java:703)
	at java.time.LocalDate.of(LocalDate.java:268)
	at Java_cert.Question116.main(Question116.java:7)

Process finished with exit code 1
 */
//Correct option is C
//dayOfMonth is not correct. days are maximum of 31 days in a month