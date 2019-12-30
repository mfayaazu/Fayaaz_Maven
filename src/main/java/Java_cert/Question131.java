package Java_cert;

public class Question131 {

    public static void main(String[] args) {
        int nums1[] = new int[3];
        int nums2[] = {1, 2, 3, 4, 5};
        nums1 = nums2;

        for (int x : nums1) {
            System.out.println(x + ":");
        }
    }
}

// Option : B
// answer : 1:2:3:4:5:
// Reason : To assign one array to another array.
//          Ensure that the two arrays have the same rank (number of dimensions) and compatible element data types.
//          Use a standard assignment statement to assign the source array to the destination array