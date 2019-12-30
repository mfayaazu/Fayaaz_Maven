package Java_cert;

public class Question107 {
    public static void main(String[] args) {
        int arr[]   = {1,2,3,4};
        int i       = 0;
        do{
            System.out.println(arr[i] + " ");
            i++;
        }while (i < arr.length - 1);
    }
}


//output : 123
//option : C
//reason : do while will print only till i = 3;