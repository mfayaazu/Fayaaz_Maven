package Java_cert;

public class Question135 {
    interface Downloadable{
        public void download();
    }

    interface Readable extends Downloadable{
        public void readBook();
    }

    abstract class Book implements Readable{
        @Override
        public void readBook() {
            System.out.println("Read Book ");
        }
    }
    public class Ebook extends Book{
        public void readBook() {
            System.out.println("Read E-Book");
        }

        @Override
        public void download() {

        }
    }
}


//Compilation at Line n3
//Correct answer is D