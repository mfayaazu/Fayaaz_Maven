package Java_cert;

public class Question105 {
    int a1;

    public static void doProduct(int a) {
        a =  a* a;
    }
    public static void doString(StringBuilder s){
        s.append(" "+ s);
    }

    public static void main(String[] args) {
        Question105 item = new Question105();
        item.a1 = 11;
        StringBuilder sb = new StringBuilder("Hello");
        Integer i = 10;
        doProduct(i);
        doString(sb);
        doProduct(item.a1);
        System.out.println(i + " " + sb + " " + item.a1);

    }
}


// Option : A (10 Hello Hello 11)
// Reason : doProduct will  not return any values so i and item.a1 remains same, but doString will append.
