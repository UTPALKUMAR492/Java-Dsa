// Take a real number input and Check if it is Integer or not Integer
package IfElseConditional;

import java.util.Scanner;

public class IntegerorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        double num = sc.nextDouble();
        int x = (int)num;
        if(num-x == 0) System.out.println((int)num+" is an Integer.");
        else System.out.println((int)num+" is not an Integer.");

    }
}
