package Java_cert;

import java.io.IOException;

public class Question89 {

  static class X {

    public void printFileContent() throws IOException {

      throw new IOException();
    }
  }

  public static class Test {

    public static void main(String[] args) {
      X xobj = new X();
      try {
        xobj.printFileContent();
      } catch (IOException e) {
        e.printStackTrace();
      } catch (Exception e) {
      }
    }
  }
}


//Correct answer is A,E