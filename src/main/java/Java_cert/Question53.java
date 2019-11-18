package Java_cert;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Question53 {
    public static void main(String[] args) {
        List<Integer> codes = Arrays.asList(10, 20);
        //UnaryOperator<Double> uo = s -> s + 10.0;         //This was the old code which was wrong

        //This is the fix
        UnaryOperator<Integer> uo = s -> s + 10;
        codes.replaceAll(uo);
        codes.forEach(c -> System.out.println(c));
    }
}

//This will give a compilation error as the List Codes is and Integer generic and uo is a Double Generic.

//Correct option is C. A compilation error occurs
//To fix this we need to change either of the collection interface to Double or integer and also change the values.´´
