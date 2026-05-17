package Array;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array:- ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements in the array:-");
        for(int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Target Value:-");
        int x = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i<arr.length; i++){
            if (arr[i] == x) {
                System.out.println("Element exist in the Array at "+i);
                flag = true;
                break;
            }
        }
        if (!flag) System.out.println("Element doesn't Exist in the Array.");
    }
}
