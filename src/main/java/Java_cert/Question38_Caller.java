package Java_cert;

import java.util.concurrent.Callable;

public class Question38_Caller implements Callable<String> {

  String str;

  public Question38_Caller(String s) {
    this.str = s;
  }

  public String call() throws Exception {
    return str.concat("Caller");
  }
}


