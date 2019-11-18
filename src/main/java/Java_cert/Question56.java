package Java_cert;

import java.util.concurrent.CyclicBarrier;

public class Question56 {
    public static void main(String[] args) {
        Master master = new Master();
    //line n2
        //CyclicBarrier cb = new CyclicBarrier(2, master);
        CyclicBarrier cb = new CyclicBarrier(1, master);
        //CyclicBarrier cb = new CyclicBarrier(master);
         Question56_Sub worker = new Question56_Sub(cb);
         worker.start();
    }
}

//Output is
/*
Master…
Worker…

Correct option is C. At line n2, insert CyclicBarrier cb = new CyclicBarrier(1, master);
 */