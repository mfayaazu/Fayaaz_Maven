package Java_cert;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Question59 {
    public static void main(String[] args) {
        List<String> nL = Arrays.asList("Jim", "John", "Jeff");
        Function<String, String> funVal = s -> "Hello :".concat(s);
        nL.stream()
                .map(funVal)
                .peek(System.out::print);
    }
}


//output is blank because Peek ignore the result
//Correct option is C.The program prints nothing.