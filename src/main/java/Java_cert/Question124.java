package com.example.mockito;

public class Question124 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder(5);
        String s="";
        System.out.println(sb);
        System.out.println(s);
        if(sb.equals(s)){
            System.out.println("Match 1");
        } else if (sb.toString().equals(s.toString())){
            System.out.println("Match 2");
        } else{
            System.out.println("No Match");
        }
    }
}


/**

 Answer is  Match 2

 **/
