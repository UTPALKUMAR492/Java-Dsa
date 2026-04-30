package Array;

import java.util.Scanner;

public class NumMulBy2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        //Default Values
        //for (int i = 0;i<arr.length;i++){
            //System.out.print(arr[i]+" ");
        //}
        //input
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        //print
        for (int j : arr) {
            System.out.print(j + " ");
        }

    }
}
