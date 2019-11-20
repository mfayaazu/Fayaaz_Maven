package Java_cert;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Question75 {

        String techName;

        Question75(String techName) {
            this.techName = techName;
        }

    public static void main(String[] args) {


        List<Question75> tech = Arrays.asList(new Question75("Java -"),
                new Question75("Oracle DB -"), new Question75("J2EE -")
        );
        Stream<Question75> stre = tech.stream();
//line n1

        //stre.forEach(System.out::print);
        stre.map(a-> a.techName).forEach(System.out::print);
        //stre.map(a-> a).forEachOrdered(System.out::print);
        //stre.forEachOrdered(System.out::print);
    }
}


//Output: Java -Oracle DB -J2EE -

//This is produced by Option B  rest others generate object values.
//Hence correct answer is B