package Java_cert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Question24 {

    String course,name,city;

    public Question24(String name,String course,String city){
        this.name=name;
        this.course=course;
        this.city=city;
    }

    public String toString(){
        return course+":"+name+":"+city;
    }

    public static void main(String[] args) {
        List<Question24> stds = Arrays.asList(
                new Question24("Fayaaz","Java SE I","Hyderabad"),
                new Question24("Ararthi","JavaSE II","Secunderabad"));
        stds.stream()
                .collect(Collectors.groupingBy(Question24::getCourse))
                .forEach((src,res)-> System.out.println(src));
    }

    public String getCourse() {
        return course;
    }

}


//Output is a compilation error so answer is D

//Because getCourse is not given in the code.