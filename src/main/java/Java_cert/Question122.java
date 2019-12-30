package com.example.mockito;

public class Question122 {

    public static void main(String[] args) {

        Short s1=200;
        Integer s2=200;
        Long s3= (long) s1+s2;

        String s4= (String) (s3+s2); // line2

        System.out.println("Sum is " + s4);

    }
}


/*

Answer is D.	A ClassCastException is thrown at line n2.

long cannot be casted to String
 */
