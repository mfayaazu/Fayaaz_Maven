package Object;

public class Solution {

    public boolean solution(int[] A){
        int A_length = A.length;

        for(int i =0;i<A_length;i++){
            int sum = A[i]+A[i+1];
            if (sum % 2 != 0)
            {
                int temp_Array[] ={A[i],A[i+1]};
             }
        }

        return true;
    }

    public void main(String[] args) {
        int A[] ={2,7,4,6,3,1};
        Solution o2 = new Solution();
        o2.solution(A);
    }
}
