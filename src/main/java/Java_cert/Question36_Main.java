package Java_cert;

import java.awt.print.Book;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Question36_Main {

  public static void main(String[] args) {
    List<Question36_Pojo> books = Arrays.asList(
                                      new Question36_Pojo("Beginning with Java", 2),
                                      new Question36_Pojo("A Guide to Java Tour", 3));
    Collections.sort(books, new Question36_Pojo());
    System.out.print(books);
  }
}

//output: [A Guide to Java Tour:3.0, Beginning with Java:2.0]

//correct answer is A
