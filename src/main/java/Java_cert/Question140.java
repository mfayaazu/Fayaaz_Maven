package Java_cert;

public class Question140 {
    public static void main(String[] args) {
        int numbers[];
        numbers = new int[2];
        numbers[0] =10;
        numbers[1]=20;

        numbers=new int[4];
        numbers[2]=30;
        numbers[3] = 40;
        for(int x: numbers){
            System.out.print(" "+x);
        }
    }
}

/*
Output:  0 0 30 40
Correct Answer is A
 */
