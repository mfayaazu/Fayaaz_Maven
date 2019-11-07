package Java_cert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Question18 {


  public static void main(String[] args) throws IOException {
    Properties prop = new Properties ();
    FileInputStream fis = new FileInputStream("C:\\Cert_Check\\Message.properties");
    prop.load(fis);
    System.out.println(prop.getProperty("welcome1"));
    System.out.println(prop.getProperty("welcome2", "Test"));   //line n1
    System.out.println(prop.getProperty("welcome3"));
  }
}



//Output is:
//    "Good day!"
//    Test
//    null

// Correct Answer is C no issues in the code