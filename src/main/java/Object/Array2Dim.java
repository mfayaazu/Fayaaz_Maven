package Object;

import java.util.Scanner;

public class Array2Dim {


        public static void main(String[] args) {
            // TODO Auto-generated method stub

            int[][] valueOne = new int[3][3]; //2-D array
            int k= 10;
            Scanner sc = new Scanner(System.in);

            //Reading an array
            System.out.print("Length of this array is : " );
            int len= sc.nextInt();
            System.out.print("Contents of this array are : ");

            for(int i=0; i<=len; i++)
            {
                System.out.println();
                for(int j=0; j<=len; j++)
                {
                    //i = i+10
                    valueOne[i][j]= valueOne[i][j]+ k;
                    System.out.print(valueOne[i][j]+" ");
                    k=k+10;
                }
            }
        }

    }
