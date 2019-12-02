package Java_cert;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Question94 {

  public static void main(String[] args) {
    String date = LocalDate
        .parse("2019-12-02")
        .format(DateTimeFormatter.ISO_DATE_TIME);

    System.out.println(date);
  }

}

/*
An exception is thrown at the runtime:
    Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException: Unsupported field: HourOfDay
    at java.time.LocalDate.get0(LocalDate.java:680)
    at java.time.LocalDate.getLong(LocalDate.java:659)
    at java.time.format.DateTimePrintContext.getValue(DateTimePrintContext.java:298)
    at java.time.format.DateTimeFormatterBuilder$NumberPrinterParser.format(DateTimeFormatterBuilder.java:2551)
    at java.time.format.DateTimeFormatterBuilder$CompositePrinterParser.format(DateTimeFormatterBuilder.java:2190)
    at java.time.format.DateTimeFormatterBuilder$CompositePrinterParser.format(DateTimeFormatterBuilder.java:2190)
    at java.time.format.DateTimeFormatterBuilder$CompositePrinterParser.format(DateTimeFormatterBuilder.java:2190)
    at java.time.format.DateTimeFormatter.formatTo(DateTimeFormatter.java:1746)
    at java.time.format.DateTimeFormatter.format(DateTimeFormatter.java:1720)
    at java.time.LocalDate.format(LocalDate.java:1691)
    at Java_cert.Question94.main(Question94.java:11)

    Process finished with exit code 1*/


//Correct answer is A
