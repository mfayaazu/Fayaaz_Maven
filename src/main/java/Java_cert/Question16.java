package Java_cert;

import java.util.Map;
import java.util.TreeMap;

public class Question16 {

  public static void main(String[] args) {
    Map<Integer, String> books = new TreeMap<>();
    books.put (1007, "A");
    books.put (1002, "C");
    books.put (1001, "B");
    books.put (1003, "B");
    System.out.println (books);
  }

}

//output: {1001=B, 1002=C, 1003=B, 1007=A}

//correct option is : B
