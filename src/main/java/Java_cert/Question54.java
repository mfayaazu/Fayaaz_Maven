package Java_cert;

public class Question54 {
    private String fName;
    private String lName;
    private static int count;

    public Question54(String first, String last) {
        fName = first;
        lName = last;
        ++count;
    }

    static {
        count = 0;
    }

    public static int getCount() {
        return count;
    }
}

class App {
    public static void main(String[] args) {
        Question54 c1 = new Question54("Larry", "Smith");
        Question54 c2 = new Question54("Pedro", "Gonzales");
        Question54 c3 = new Question54("Penny", "Jones");
        Question54 c4 = new Question54("Lars", "Svenson");
        c4 = null;
        c3 = c2;
        int i=Question54.getCount();
        System.out.println(i);
    }
}
