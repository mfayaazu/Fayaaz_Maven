package Java_cert;

public class Question106_Test {


        public static void main(String []args){
            Question106_Test ts = new Question106_Test();
            System.out.print(isAvailable +" ");
            ts.doStuff();
            System.out.println(isAvailable);
        }
        public static boolean doStuff(){
            return !isAvailable;
        }
        static boolean isAvailable = false;
    }

//Output : false false
//Correct Answer : D
//Reason : The value of a static variable will be retained throught the life of the program.

