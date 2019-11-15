package Java_cert;

import java.io.Closeable;
import java.io.IOException;

class Question50 implements AutoCloseable{  //line n1

  //line n2
  public void close () throws IOException {
    System.out.print("Close");
  }
  public void open() {
    System.out.print("Open");
  }
}

class Test {

  public static void main(String[] args) throws Exception {
    try(Question50 f = new Question50()) {
      f.open();
    }
  }
}


//Output: OpenClose
//Correct Option is A,E