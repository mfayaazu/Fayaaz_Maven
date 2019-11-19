package Java_cert;

import java.util.Arrays;


public class Question74 {

    public static int checkValue(String s1, String s2) {
        return s1.length() - s2.length();
    }

    public static void main(String[] args) {
        String[] strArray = new String[]{"Tiger", "Rat", "Cat", "Lion"};
        Arrays.sort(strArray, Question74::checkValue);
        for (String s : strArray) {
            System.out.print(s + " ");
        }
    }
}

//Output:
//Rat Cat Lion Tiger
//Correct Answer is A as other options give compilation error

