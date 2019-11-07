package Java_cert;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Question25Class implements Question25 {

    public static void main(String[] args) {
        List<String> strs = Arrays.asList("Java", "Java EE", "Java ME");
        Predicate<String> cf1 = s -> s.length() > 3;
        Predicate cf2 = new Question25() {
            @Override
            public boolean test(String s) {
                return s.contains("Java");
            }
        };
        long c = strs.stream()
                .filter(cf1)
                .filter(cf2)
                .count();
        System.out.println(c);
    }

}
