package Java_cert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question35_Main {

  public static void main(String[] args) {
    List<Question35> products = new ArrayList<>(Arrays.asList(
        new Question35(1, 10),
        new Question35 (2, 30),
        new Question35 (2, 20)));
    Question35 p = products.stream()
                          .reduce(new Question35(4,0), (p1, p2) -> {
                            p1.price+=p2.price;
                            return new Question35 (p1.id, p1.price);
                              });

    products.add(p);
    products.stream()
        .parallel()
        .reduce((p1, p2) -> p1.price > p2.price ? p1:p2)
        .ifPresent(System.out::println);
  }

}

//output: 4:60
//there are modifications in this program. We need to add List<Question35> products = new ArrayList<>(Arrays.asList(

//Correct answer is C
