// Take positive integer input and tell if is a four digit number or not.

package IfElseConditional;

import java.util.Scanner;

public class FourDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:-");
        int num = sc.nextInt();
        if (num > 999 && num < 10000)
            System.out.println(num+" is four digit number.");
        else System.out.println(num+" is not four digit number.");
    }
}
