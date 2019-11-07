package Java_cert;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

public class Question31 {

    public static void main(String[] args) throws IOException {
        Stream<Path> files= Files.walk(Paths.get(System.getProperty("user.home")));
        files.forEach(fName->{                                  //line n1
            try{
                Path aPath =fName.toAbsolutePath();             //line n2
                System.out.println(fName+":"+
                        Files.readAttributes(aPath, BasicFileAttributes.class).creationTime());
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}


// A is correct.
// Still, it could throw java.nio.file.AccessDeniedException in case if same files are not accessible.