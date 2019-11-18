package Java_cert;

import java.util.function.BiFunction;

public class Question66 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> val = (t1, t2) -> t1 + t2;	//line n1
        System.out.println(val.apply(10, 10));
    }
}


//output: A compilation occurs in line n1.

//Correct answer is : C.A compilation error occurs at line n1.

//Simple solution will be two ways:
//        1. change t2 in line n1 to t2.intValue()
//        2. Change generic from Double to Integer and change the value from 10.5 to 10