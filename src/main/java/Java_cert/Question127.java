package com.example.mockito;

public class Question127 {

    public  Question127(){
        System.out.println("A");
    }
}

class  B extends Question127{
    public  B(){
        System.out.println("B");
    }
}
class  C extends B{
    public  C(){
        System.out.println("C");
    }

    public static void main(String[] args) {
        C c = new C();
    }
}


/**
 Answer is ABC

 ***/
