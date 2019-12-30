package Java_cert;

public class Question112_main {

    public static void main(String[] args) {
        Q_Car c1 = new Q_Car("Auto");
        Q_Car c2 = new Q_Car("4W",150,"Manual");
        System.out.println(c1.type+" "+c1.maxSpeed+" "+c1.trans);
        System.out.println(c2.type+" "+c2.maxSpeed+" "+c2.trans);
    }
}
