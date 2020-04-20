package Java_cert;
public class Question103_Main {
    public void  matchShirt(){
        //line n2
         String color = Question103.getColor();
        if(color.equals("Green")){
            System.out.println("Fit");
        }
    }

    public static void main(String[] args) {
        Question103_Main trouser = new Question103_Main();
        trouser.matchShirt();
    }
}

//Correct Option is A,C,D

















































