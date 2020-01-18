package com.example.mockito;

public class Question129 {

    static  int count=0;
    int i=0;

    public void changeCount(){
        while(i<5){
            i++;
            count++;
        }
    }

    public static void main(String[] args) {
        Question129 check1= new Question129();
        Question129 check2= new Question129();

        check1.changeCount();

        check2.changeCount();
        System.out.println( check1.count + ": " + check2.count);
    }
}


/*

Static variable count is constant for all objects

So answer is 10: 10
 */
