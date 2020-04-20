package Java_cert;

public class Question121 {

public void displayC2(){
    System.out.println("C2");
}
}

interface I{
    public void displayI();
        }


class C1 extends Question121 implements I {

    public void displayI() {
        System.out.println("C1");

    }
}

/*

Answer is Compilation Fails
 */
