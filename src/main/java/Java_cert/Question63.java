package Java_cert;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question63 {
    public static void main(String[] args) {
        List<Question63_Emp> li = Arrays.asList(new Question63_Emp("Sam", 20),
                new Question63_Emp("John", 60),
                new Question63_Emp("Jim", 51));
        Predicate<Question63_Emp> agVal = s -> s.getEAge() > 50;    //line n1
        li = li.stream()
                .filter(agVal)
                .collect(Collectors.toList());
        Stream<String> names = li.stream()
                .map(Question63_Emp::getEName);    //line n2
        names.forEach(n -> System.out.print(n + " "));
    }
}


//Output: John Jim

//No issues with the code.. The code just takes the list values and picks up based on the age value.