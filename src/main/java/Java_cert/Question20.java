package Java_cert;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Question20 {

  public static void main(String[] args) {
    Path p1 = Paths.get("C:\\ABC.jpeg");
    System.out.println(p1.getNameCount() +
        ":" + p1.getName(1) +
        ":" + p1.getFileName());
  }
}
//output is :
/*
Exception in thread "main" java.lang.IllegalArgumentException
	at sun.nio.fs.WindowsPath.getName(WindowsPath.java:620)
	at sun.nio.fs.WindowsPath.getName(WindowsPath.java:44)
	at Java_cert.Question20.main(Question20.java:11)
*/
//Correct Option is A an exception is thrown