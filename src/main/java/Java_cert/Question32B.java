package Java_cert;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Question32B {

  public static void main(String[] args) {
    int i;
    char c;
    try {
      FileInputStream fis = new FileInputStream("C:\\Cert_Check\\course.txt");
      InputStreamReader isr = new InputStreamReader(fis);
      while (isr.ready()) {       //line n1
        isr.skip(2);
        i = isr.read();
        c = (char) i;
        System.out.print(c);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}


// Output is : "ueJa"
// program will skip two characters and take one next character and print it at a time