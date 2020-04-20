package Object;

public class PracticeInheritance {

    public int a,b,c;

    public PracticeInheritance(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public PracticeInheritance(){
    }

    public void method1(){
        System.out.println("This is method 1");
    }

    public void method2(){
        System.out.println("This is  A value: "+ a);
        System.out.println("This is  B value: "+ b);
        System.out.println("This is  C value: "+ c);
    }
}
