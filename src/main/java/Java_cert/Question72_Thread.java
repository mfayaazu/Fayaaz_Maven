package Java_cert;

import java.util.concurrent.Callable;

public class Question72_Thread implements Callable<String> {
    String str;

    public Question72_Thread(String s) {
        this.str = s;
    }

    public String call() throws Exception {
        return str.concat("Call");
    }
}
