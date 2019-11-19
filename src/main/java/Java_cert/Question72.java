package Java_cert;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Question72 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService es = Executors.newFixedThreadPool(4);    //line n1
        Future f1 = es.submit(new Question72_Thread("Call"));
        String str = f1.get().toString();
        System.out.println(str);
        es.shutdown();
    }
}

//output is : CallCall and the program does not terminates
//Option B is correct
// we can use es.shutdown() method and close the thread.