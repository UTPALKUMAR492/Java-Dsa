// Take integer input and print the absolute value of that number.
package IfElseConditional;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:-");
        int num = sc.nextInt();
        if(num < 0)
            System.out.println(-num);
        else
            System.out.println(num);

    }
}
