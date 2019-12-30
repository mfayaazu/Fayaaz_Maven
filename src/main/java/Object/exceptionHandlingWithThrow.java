package Object;

public class exceptionHandlingWithThrow {

    public static void main(String[] args) {
    a();
    }

    public static void a(){
            b();
        System.out.println("Method 1");

    }

    public static void b(){
        System.out.println("Method 2");
       try {
           int a=50/0;
           System.out.println("Execute ainda???");
       }catch (ArithmeticException e){
           System.out.println("Error");
       }
        System.out.println("Idi aithadi");
    }
}
