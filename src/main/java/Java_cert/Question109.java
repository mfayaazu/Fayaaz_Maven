package Java_cert;

public class Question109 {

    public static void main(String[] args) {
        if(args[0].equals("Hello") ? false : true) {
            System.out.println("Success");
        } else{
            System.out.println("Failure");
        }
    }
}

// Option : B
// Result : Success
//Reason  : We are passing Hello as argument from command line
