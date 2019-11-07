package Java_cert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question22 {


  public static void main (String [ ] args) throws IOException {
    BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    System.out.print ("Enter GDP: ");

    //A.
    //int GDP = Integer.parseInt (br.readline());

    //B.
    int GDP = br.read();

    //C:
    //int GDP = br.nextInt();

    //D:
    //int GDP = Integer.parseInt (br.next());

  }
}
// output is : Enter GDP: fayaaz

//Correct option is B
