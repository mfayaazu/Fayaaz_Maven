package Java_cert;

public class Question119 {
    public static void main(String[] args) {
        System.out.println("String Main "+args[0]);
    }
    public static void main(int[] args) {
        System.out.println("int Main "+args[0]);
    }
    public static void main(Object[] args) {
        System.out.println("Object Main "+args[0]);
    }
}


// A runtime exection is thrown
//Error: Could not find or load main class Question119

//Correct Answer A