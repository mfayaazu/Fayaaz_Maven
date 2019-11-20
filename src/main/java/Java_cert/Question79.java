package Java_cert;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Question79 {
    public static void main(String[] args) throws IOException {
        BufferedReader brCopy = null;
        try (BufferedReader br = new BufferedReader(new FileReader("/Users/fayaazuddinalimohammad/cert-check/employee.txt"))) {
            //line n1
            br.lines().forEach(c -> System.out.println(c));
            brCopy = br;    //line n2
        }
        brCopy.ready(); //line n3;
    }
}

//Output:
/*
this is employee text
Exception in thread "main" java.io.IOException: Stream closed
	at java.base/java.io.BufferedReader.ensureOpen(BufferedReader.java:122)
	at java.base/java.io.BufferedReader.ready(BufferedReader.java:447)
	at Java_cert.Question79.main(Question79.java:15)

Process finished with exit code 1

//Correct answer is: D.The code prints the content of the employee.txt file and throws an exception at line n3.
 */