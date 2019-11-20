package Java_cert;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Question78 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(10, 20);
        List<Integer> list2 = Arrays.asList(15, 30);
        //line n1
        Stream.of(list1, list2)
                .flatMap(list -> list.stream())
                .forEach(s -> System.out.print(s + " "));

//        Stream.of(list1, list2)
//                .flatMap(list -> list.intStream())
//                .forEach(s -> System.out.print(s + " "));

//        list1.stream()
//                .flatMap(list2.stream().flatMap(e1 -> e1.stream())
//                .forEach(s -> System.out.println(s + " "));

//        Stream.of(list1, list2)
//                .flatMapToInt(list -> list.stream())
//                .forEach(s -> System.out.print(s + " "));

    }
}
//output: 10 20 15 30
//correct answer is : A.    Stream.of(list1, list2)
//                                  .flatMap(list -> list.stream())
//                                  .forEach(s -> System.out.print(s + “ “));

//the other options will return compilation error.