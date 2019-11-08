package Java_cert;

public class Question33<T> {

  private T t;

  public T get() {
    return t;
  }

  public void set(T t) {
    this.t = t;
  }

  public static void main(String args[]) {
    Question33<String> type = new Question33<>();
    Question33 type1 = new Question33();  //line n1
    type.set("Java");
    type1.set(100);  //line n2
    System.out.print(type.get() + " " + type1.get());
  }
}

//Output is : Java 100

// Correct option is: A