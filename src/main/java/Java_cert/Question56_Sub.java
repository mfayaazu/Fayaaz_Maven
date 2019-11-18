package Java_cert;

import java.util.concurrent.CyclicBarrier;

public class Question56_Sub extends Thread {

        CyclicBarrier cb;

        public Question56_Sub(CyclicBarrier cb) {
            this.cb = cb;
        }

        public void run() {
            try {
                cb.await();
                System.out.println("Worker…");
            } catch (Exception ex) {
            }
        }
    }

    class Master implements Runnable { //line n1
        public void run() {
            System.out.println("Master…");
        }
    }

