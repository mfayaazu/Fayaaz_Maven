package Java_cert;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Question49 {

  public static void main(String[] args) {
    Stream<Path> paths = Stream.of(
        Paths.get("C:\\Cert_Check\\data.doc"),
        Paths.get("C:\\Cert_Check\\data.txt"),
        Paths.get("C:\\Cert_Check\\data.xml"));

    paths.filter(s -> s.toString().endsWith("txt"))
        .forEach(s -> {
              try {
                Files.readAllLines(s)
                    .stream()
                    .forEach(System.out::println);            //line n1
              } catch (IOException e) {
                System.out.println("Exception");
              }
            }
        );
  }
}


//output: This is text file
//Answer: Correct answer is Option A