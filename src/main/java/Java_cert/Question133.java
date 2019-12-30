package Java_cert;

public class Question133 {
    public static void main(String[] args) {
        int array[] =  {10,20,30,40,50};
        int x =  array.length;
        while (x > 0){
            x--;
            System.out.println(array[x]);
        }
    }
}

//Option    = E,A
//Reason : Post decrement and pre-decrement both works accordingly as per options