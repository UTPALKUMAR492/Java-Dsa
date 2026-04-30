package Array;

import java.util.Scanner;

public class MulOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array:- ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int Mul = 1;
        System.out.println("Enter Elements of Array:- ");
        for(int i=0;i< arr.length;i++){
            arr[i] = sc.nextInt();
            Mul *= arr[i];
        }
        System.out.println("Multiplication of Elements of Array:- "+Mul);
    }
}
