package Java_cert;

import static java.nio.file.Files.readAllLines;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class Question12 {

  public static void main(String[] args) throws IOException {
    Path file = Paths.get ("C:\\Repository\\Fayaaz_Maven\\src\\main\\java\\Java_cert\\courses.txt");

//    //A.
//    List<String> fc = (List<String>) Files.list(file);
//    fc.stream().forEach (s -> System.out.println(s));

//    //B.
//    Stream<String> fc = readAllLines (file);
//    fc.forEach (s -> System.out.println(s));
//
//    //C.
//    List<String> fc = readAllLines(file);
//    fc.stream().forEach (s -> System.out.println(s));
//
//    //D.
    Stream<String> fc = Files.lines (file);
    fc.forEach (s -> System.out.println(s));
// line n1
  }
}

//c and d both work but i will also prefer D as this is correct code.
