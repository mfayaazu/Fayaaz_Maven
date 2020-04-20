package Java_cert;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Question83 {
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("red", "green", "yellow");
        Predicate<String> test = n -> {
            System.out.println("Searching…");
            return n.contains("red");
        };
        colors.stream()
                .filter(c -> c.length() >= 3)
                .allMatch(test);
    }
}
//Output:Searching…
//Correct answer is A.Searching…
