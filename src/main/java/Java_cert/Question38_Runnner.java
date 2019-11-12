package Java_cert;

public class Question38_Runnner implements Runnable {

  String str;

  public Question38_Runnner(String s) {
    this.str = s;
  }

  public void run() {
    System.out.println(str.concat("Runner"));
  }
}
