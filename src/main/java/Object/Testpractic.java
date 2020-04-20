package Object;

// Java program to find longest
// prefix with equal numbers
// of X and Y.
public class Testpractic{

    // Function to find the max index
// of largest prefix with same
// number if X and Y
    static int findIndex(int []arr, int X,
                         int Y, int n)
    {

        // counters for X and Y
        int nx = 0, ny = 0;

        int result = -1;
        for (int i = 0; i < n; i++)
        {
            // If value is equal to X
            // increment counter of X
            if (arr[i] == X)
                nx++;

            // If value is equal to Y
            // increment counter of Y
            if (arr[i] == Y)
                ny++;

            // If counters are equal(but not
            // zero) save the result as i
            if ((nx != 0) && (nx == ny))
                result = i;
        }

        return result;
    }

    // Driver code
    static public void main (String[] args)
    {
        int []arr = {100,63,1,6,2,13};
        int X = 100, Y = 63;
        int n = arr.length;
        System.out.println("Ending index of prefix is "
                + findIndex(arr, X, Y, n));
    }
}

// This code is contributed by vt_m.
// Improved by Qu Dongfang.

