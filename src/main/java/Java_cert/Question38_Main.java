package Java_cert;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Question38_Main {

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    ExecutorService es = Executors.newFixedThreadPool(2);
    Future f1 = es.submit(new Question38_Caller("Call"));
    Future f2 = es.submit(new Question38_Runnner("Run"));
    String str1 = (String) f1.get();
    String str2 = (String) f2.get();  //line n1
    System.out.println(str1+ ":" + str2);
  }
}


//output: RunRunner
//        CallCaller:null

// and the program does not terminates

//Correct option is A