package com.example.mockito;

public class Question121 {

public void displayC2(){
    System.out.println("C2");
}
}

interface I{
    public void displayI();
        }


class C1 extends Question121 implements I{

    public void displayI() {
        System.out.println("C1");
    }

    Question121 obj1= new Question121();
    I obj2= new C1();

    Question121 s = obj2;
    I t= obj1;

    t.displayI();
    s.displayC2();
}


/*

Answer is Compilation Fails
 */
