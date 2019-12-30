package Java_cert;

public class Question114_TestA {
    public static void main(String[] args) {
        Question114_Alpha ref1 = new Question114_Alpha(50);
        Question114_Alpha ref2 = new Question114_Alpha(125);
        Question114_Alpha ref3 = new Question114_Alpha(100);
        ref1.doPrint();
        ref2.doPrint();
        ref3.doPrint();
    }
}

/*
Output:
ns =50s =125
ns =125s =125
ns =0s =125
 */
//Correct Answer is B
