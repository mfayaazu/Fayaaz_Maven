package Java_cert;

public class Question84 {
    class UserException extends Exception {
    }

    class AgeOutOfLimitException extends UserException {
    }
        public void doRegister(String name, int age)
                throws UserException, AgeOutOfLimitException {
            if (name.length() < 6) {
                throw new UserException();
            } else if (age >= 60) {
                throw new AgeOutOfLimitException();
            } else {
                System.out.println("User is registered.");


            }
        }

        public static void main(String[] args) throws UserException {
            Question84 t = new Question84();
            t.doRegister("Mathew", 60);
        }
    }


//An Age OutOfException is thrown
//  Exception in thread "main" Java_cert.Question84$AgeOutOfLimitException
//	at Java_cert.Question84.doRegister(Question84.java:14)
//	at Java_cert.Question84.main(Question84.java:24)

//Correct answer is B