package Java_cert;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Question26II extends Question26I {


    public Question26II(String fName, String lname) {
        super(fName, lname);
    }

    public static void main(String[] args) {
        List<Question26I> emp = Arrays.asList(
                new Question26I("Anand","Kesavan"),
                new Question26I("Fayaaz","Ali"),
                new Question26I("John","Smith"));
        emp.stream()
                .sorted(Comparator.comparing(Question26I::getfName).reversed().thenComparing(Question26I::getLname))
                .collect(Collectors.toList())
        .forEach((src)->System.out.println(src.toString()));
    }
}


//Output:
//        John:Smith
//        Fayaaz:Ali
//        Anand:Kesavan

//Correct option is A