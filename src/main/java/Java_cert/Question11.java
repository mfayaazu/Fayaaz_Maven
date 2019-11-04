package Java_cert;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Question11 {

  public static void main(String[] args) {
    Stream<List<String>> iStr= Stream.of (
        Arrays.asList ("1", "John"),
        Arrays.asList ("2", null));
    Stream<String> nInSt = iStr.flatMap((x) -> x.stream ());
        nInSt.forEach (System.out :: print);
  }
}

/*
  Correct Answer id D we cannot convert Stream into FlatMap int. This will give a compilation error correct suggestion is FlatMap()
 */
