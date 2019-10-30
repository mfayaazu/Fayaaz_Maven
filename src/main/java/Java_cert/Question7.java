package Java_cert;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Question7 {

  public void fly() {
    System.out.println("Can Fly");
  }
}

class Penguin extends Question7 {

  public void fly() {
    System.out.println("Cannot Fly");
  }
}

class Birdie {

  public static void main(String[] args) {
    fly(() -> new Question7());
    fly(Penguin::new);
    }
  static void fly(Supplier<Question7> question7Supplier) {
    question7Supplier.get().fly();
  }
}

//Option A-- Wrong Compilation error at Fly()
//  static void fly(Consumer<?extends Question7> question7Consumer){
//    question7Consumer::fly();
//  }

//Option B-- wring Answer Compilation Error at Accept()
//  static void fly(Consumer<?extends Question7> question7Consumer){
//    question7Consumer.accept().fly();
//  }

//Option C -- Correct answer
//  static void fly(Supplier<Question7> question7Supplier) {
//    question7Supplier.get().fly();
//  }

//Output:
//      Can Fly
//      Cannot Fly

//Option D-- wrong answer No keyword like LOST
//  static void fly(Supplier<?extends Question7> question7Supplier){
//    LOST
//  }

