package Java_cert;

public class Question118 {
    int x,y;
    public Question118(int x,int y){
        initialize(x,y);
    }
    public void  initialize(int x,int y){
        this.x=x;
        this.y=y;
    }

    public static void main(String[] args) {
        int x=3, y=5;
        Question118 obj = new Question118(x,y);
        System.out.println(x + " "+ y);
    }
}


/*
Output: 3 5
Correct answer is : D
 */