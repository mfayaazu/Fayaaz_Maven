package Java_cert;

import java.util.ArrayList;

public class Question137 {
    public static void main(String[] args) {
        ArrayList myList =  new ArrayList();
        String[] myArray;
        try{
            while(true){
                myList.add("my String");
            }
        }catch (RuntimeException re){
            System.out.println("caught a RuntimeException");
        }catch (Exception e){
            System.out.println("Caught an Exception");
        }
        System.out.println("Ready to use");
    }
}

//Option : E
//Reason : Exception in thread "main" java.lang.OutOfMemoryError: Java heap space