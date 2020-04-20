package Java_cert;

public class Question123 {

    public static void main(String[] args) {

        int x=1;
        int y=0;
        if (x++ >++y){
            System.out.println("Hello");
        }else{
            System.out.println("Welcome");
        }
        System.out.println("Log" + x +":" +y);
    }
}

/*
  Else condition will be executed first
 x value will be 2 and Y will be 1

 Answer is  " Welcome Log 2:1 "

 */
