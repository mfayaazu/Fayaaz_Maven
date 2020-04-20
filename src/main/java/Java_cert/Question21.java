package Java_cert;

import java.util.concurrent.atomic.AtomicInteger;

public class Question21 implements Runnable {

    private static AtomicInteger count = new AtomicInteger (0);
    public void run () {
      int x = count.incrementAndGet(); System.out.print (x+" ");
    }

  public static void main(String[] args) {
    Thread thread1 = new Thread(new Question21());
    Thread thread2 = new Thread(new Question21());
    Thread thread3 = new Thread(new Question21());
    Thread [] ta = {thread1, thread2, thread3};
    for (int x= 0; x < 3; x++) {
      ta[x].start();
    }
  }
}


//Output: 1 2 3

//Correct Answer is A unpredictable order it prints 1 2 3 in