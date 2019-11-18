package Java_cert;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Question68 {
    public static void main(String[] args) {
        UnaryOperator<Integer> uo1 = s -> s*2;	//line n1
        List<Double> loanValues = Arrays.asList(1000.0, 2000.0);
        loanValues.stream()
                .filter(lv -> lv >= 1500)
                .map(lv -> uo1.apply(lv.intValue()))
                .forEach(s -> System.out.print(s + " " ));
    }
}

//Compilation error at line n2
//Because the Lambda function 'apply' is defined for Double and cannot handle Integer values

//Correct answer is B
//Some option will be to change the declarations as Integer or double or use apply method with lv.intValues(). This will give the output as 4000