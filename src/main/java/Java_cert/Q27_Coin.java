package Java_cert;

public class Q27_Coin {
    public static void main(String[] args) {
        Q27_USCurrency usCoin =  Q27_USCurrency.DIME;
        System.out.println(usCoin.getValue());
    }
}


//Output is  10
//Correct answer is B,C

/*
B.
Make the USCurrency enumeration constructor private.

C.
Remove the new keyword from the instantiation of usCoin.
 */