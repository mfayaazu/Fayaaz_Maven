package Java_cert;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

//Question9
public class Sum extends RecursiveAction {
    static final int THRESHOLD_SIZE = 3;
    int stIndex,lstIndex;
    int[] data;

    public Sum(int[]data,int start,int end){
        this.data=data;
        this.stIndex=start;
        this.lstIndex=end;
    }

    @Override
    protected void compute() {
        int sum =0;
        if(lstIndex-stIndex <=THRESHOLD_SIZE){
            for (int i =stIndex;i<lstIndex;i++){
                sum +=data[i];
            }
            System.out.println(sum);
        }else {
            new Sum(data,stIndex+THRESHOLD_SIZE,lstIndex).fork();
            new Sum(data,stIndex,Math.min(lstIndex,stIndex+THRESHOLD_SIZE)).compute();
        }
    }

    public static void main(String[] args) {
        ForkJoinPool fJPool = new ForkJoinPool();
        int data[]={1,2,3,4,5,6,7,8,9,10};
        fJPool.invoke(new Sum(data,0,data.length));
    }
}


//output:
//        6
//        15
//        10
//        24

// The code prints several values with total sum to result 55 Option A is correct