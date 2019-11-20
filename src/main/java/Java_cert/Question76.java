package Java_cert;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Question76 {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("/Users/fayaazuddinalimohammad/cert-check/green.txt");
        Path target = Paths.get("/Users/fayaazuddinalimohammad/cert-check/colors/yellow.txt");
        Files.move(source, target, StandardCopyOption.ATOMIC_MOVE);
        Files.delete(source);
    }
}
//Output:
/*Connected to the target VM, address: '127.0.0.1:51298', transport: 'socket'
Exception in thread "main" java.nio.file.NoSuchFileException: /Users/fayaazuddinalimohammad/cert-check/green.txt
	at java.base/sun.nio.fs.UnixException.translateToIOException(UnixException.java:92)
	at java.base/sun.nio.fs.UnixException.rethrowAsIOException(UnixException.java:111)
	at java.base/sun.nio.fs.UnixException.rethrowAsIOException(UnixException.java:116)
	at java.base/sun.nio.fs.UnixFileSystemProvider.implDelete(UnixFileSystemProvider.java:245)
	at java.base/sun.nio.fs.AbstractFileSystemProvider.delete(AbstractFileSystemProvider.java:105)
	at java.base/java.nio.file.Files.delete(Files.java:1141)
	at Java_cert.Question76.main(Question76.java:14)
Disconnected from the target VM, address: '127.0.0.1:51298', transport: 'socket'

Process finished with exit code 1
*/

//Correct answer is : B.The yellow.txt file content is replaced by the green.txt file content and an exception is thrown.

