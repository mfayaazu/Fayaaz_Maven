package Java_cert;

public class Question125 {
        void readCard(int cardNo) throws Exception {
        System.out.println ("Reading Card");
    }
    void checkCard(int cardNo) throws RuntimeException  {
        System.out.println("Checking Card");
    }// line nl


    public static void main(String[] args) throws Exception {
        Question125  ex = new Question125 ();
    int cardNo = 12344;
        ex.checkCard(cardNo) ; //line n2
        ex.readCard(cardNo);  //line n3
    }
}


/*

If an exception is thrown in a method then it should be added in all the places where the method is being used.
Here ReadCard method  doesn't add exception   at line n3
 */
