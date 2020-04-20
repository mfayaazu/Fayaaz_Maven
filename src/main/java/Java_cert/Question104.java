package Java_cert;

import java.util.Arrays;

public class Question104 {
    public static void main(String[] args) {
        int numbers[] = {12, 13, 42, 32, 15, 156, 23, 51, 12};
        int max = findMax(numbers);
        System.out.println(max);
    }

    static int findMax(int[] numbers) {
        int max = 0;
        Arrays.sort(numbers);
        max = numbers[numbers.length - 1];
        return max;
    }
}

//Option :  A (static int findMax(int[] numbers))
//Reason : method should be static to be called without creating an object inside static methods