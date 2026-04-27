package Methods;

import java.util.Scanner;

public class Swap2Num {
    public static void swap(int a, int b){

        System.out.println("Before Swap:\nNum1: "+a+" Num2: "+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After Swap:\nNum1: "+a+" Num2: "+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Num :");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Num :");
        int b = sc.nextInt();
        swap(a,b);
    }
}
