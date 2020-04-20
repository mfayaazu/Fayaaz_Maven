package Java_cert;

public class Question122 {

    public static void main(String[] args) {

        Short s1=200;
        Integer s2=200;
        Long s3= (long) s1+s2;
        long s4= s3+s2; // line2

        System.out.println("Sum is " + s4);

    }
}


/*

Answer is B Compilation error fails at line 2
 */
