//Take a number from user and Check Even or Odd.
package IfElseConditional;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a +ve Number:-");
        int num = sc.nextInt();
        if(num%2 == 0)
            System.out.println("Even No.");
        else
            System.out.println("Odd No.");
    }
}
