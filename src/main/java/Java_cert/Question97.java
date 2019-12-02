package Java_cert;

import java.util.Map;

public class Question97 extends RuntimeException{

  public static class Test{

    public static void main(String[] args) {
      try{
        method1();
      } catch (Question97 e) {
        System.out.println("A");
      }
    }

    private static void method1() {
      try{
        throw Math.random() > 0.5 ? new Question97():new RuntimeException();
      } catch (RuntimeException e) {
        System.out.println("B");
      }
    }
  }

}

//Output is B
//Correct Answer is D