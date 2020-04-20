package Java_cert;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Question23 {

    public static void main(String[] args) throws IOException {
        Path source = Paths.get("/Users/fayaazuddinalimohammad/cert-check/Java Projects/log.txt");
        Path destination=Paths.get("/Users/fayaazuddinalimohammad/data/log.txt");
        Files.copy(source,destination);
    }
}

//output:
/*
Exception in thread "main" java.nio.file.FileAlreadyExistsException: /Users/fayaazuddinalimohammad/data
	at java.base/sun.nio.fs.UnixCopyFile.copy(UnixCopyFile.java:573)
	at java.base/sun.nio.fs.UnixFileSystemProvider.copy(UnixFileSystemProvider.java:254)
	at java.base/java.nio.file.Files.copy(Files.java:1294)
	at Java_cert.Question23.main(Question23.java:13)
 */

//Correct answer is D. as the /data folder already exists.