package Java_cert;

public class Question14 {

  static void doStuff() throws ArithmeticException, NumberFormatException, Exception {
    if (Math.random() >-1) throw new Exception ("Try again");  }


  public static void main(String[] args) {
    try {
      doStuff();
    } catch (ArithmeticException|NumberFormatException e) {
      System.out.println (e.getMessage()); }
    catch (Exception e) {
      System.out.println (e.getMessage()); }
  }
  }

// Output Try Again

// Correct answer is Option C to remove Exception form the catch block