package Array;
import java.util.Scanner;
public class MaxElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array:-");
        int n = sc.nextInt();
        System.out.println("Enter Elements in the Arrays:-");
        int arr[] = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements in the Array:-");
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int gr = arr[0];
        for(int i = 0;i< arr.length-1;i++){
            if(gr<arr[i+1]){
                gr = arr[i+1];
            }
        }
        System.out.println("Greatest Among all Number:- "+gr);
        int least = arr[0];
        for(int i = 0;i<arr.length-1;i++){
            if (least>arr[i+1]){
                least = arr[i+1];
            }
        }
        System.out.println("Smallest Among all Number:- "+least);
    }
}
