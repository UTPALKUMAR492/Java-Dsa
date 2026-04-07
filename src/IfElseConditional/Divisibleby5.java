//Take a +ve integer input and tell if it is divisible by 5 or not.
package IfElseConditional;

import java.util.Scanner;

public class Divisibleby5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:-");
        int num = sc.nextInt();
        if(num % 5 == 0)
            System.out.println(num +" is Divisible by 5.");
        else
            System.out.println(num + " is not divisible by 5.");
    }
}
