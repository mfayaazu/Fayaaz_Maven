package Java_cert;

import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;

public class Question2 {


  public static void main(String[] args) {

    IntStream stream = IntStream.of(1,2,3);
    IntFunction<IntUnaryOperator> inFu=x->y->x*y;          //line n2  Use IntUnaryOperator Option B
    IntStream newStream =stream.map(inFu.apply(10));      //line n2
    newStream.forEach(System.out::print);
  }
}
