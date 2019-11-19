package Java_cert;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class Question73 implements Runnable {
    String fName;

    public Question73(String fName) {
        this.fName = fName;
    }

    public void run() {
        System.out.println(fName);
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        ExecutorService executor = Executors.newCachedThreadPool();
        Stream<Path> listOfFiles = Files.walk(Paths.get("/Users/fayaazuddinalimohammad/cert-check/Java Projects"));
        listOfFiles.forEach(line -> {
            executor.execute(new Question73(line.getFileName().toString()));    //line n1
        });
        executor.shutdown();
        executor.awaitTermination(5, TimeUnit.DAYS);                         //line n2
    }
}
//Output:
/*
Java Projects
log_copy.txt
log.txt
*/
//Corect answer is C.The program prints files names sequentially.