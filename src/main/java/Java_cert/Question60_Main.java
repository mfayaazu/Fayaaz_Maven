package Java_cert;

import java.util.Locale;

public class Question60_Main{
    public static void main(String[] args) {
        Question60<Integer> animal = n -> System.out.println("Running" + n);
        animal.run(100);
        animal.walk(20);

/*        Question60<Integer> animal = n ->n + 10;      This gives an error in the compilation time
        animal.run(100);
        animal.walk(20);*/


/*        Question60 animal = (Integer n) -> System.out.println(n);         This is incompatble declaration
        animal.run(100);
        Question60.walk(20);*/
    }
}

//Output is

/*Running100
Walking
Correct option is :A. Moveable can be used as below:
                        Moveable<Integer> animal = n - > System.out.println(“Running” + n);
                        animal.run(100);
                        animal.walk(20);

*/