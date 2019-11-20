package Java_cert;

public class Question80 {
        public String read(String bname) {
            return "Read" + bname;
        }
    }
    class EBook extends  Question80{

        public String read(String url)
        {
            return "View"+ url;
        }
    }
    class Test1 {
        public static void main(String[] args) {
            Question80 b1 = new Question80();
            b1.read("Java Programing");
            Question80 b2 = new EBook();
            b2.read("http://ebook.com/ebook");
        }
    }

//Answer is D method read has private access modifier in class Book.java and both b1 and b2 are of reference
// type Book so compiler checks there first.