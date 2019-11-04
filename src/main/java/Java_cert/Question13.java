package Java_cert;

import java.io.File;
import java.io.IOException;

public class Question13 {

  public void recDelete (String dirName) throws IOException {
    File[] listOfFiles = new File(dirName).listFiles();
    if (listOfFiles != null && listOfFiles.length >0) {
      for (File aFile : listOfFiles) {
      if (aFile.isDirectory()) {
        recDelete (aFile.getAbsolutePath ());
      } else {
        if (aFile.getName ().endsWith (".class")) aFile.delete ();
      }
    }
    }
  }

  public static void main(String[] args) throws IOException {
    Question13 object1 =new Question13();
    object1.recDelete("C:\\Cert_Check");
  }
}

//Option B is correct it will delete -class only from project directory