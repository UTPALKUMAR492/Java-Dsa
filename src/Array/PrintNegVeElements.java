package Array;

import java.util.Scanner;

public class PrintNegVeElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array:- ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements of Array:-");
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for (int j : arr) {
            if (j < 0) {
                System.out.print(j + " ");
            }
        }
    }
}
