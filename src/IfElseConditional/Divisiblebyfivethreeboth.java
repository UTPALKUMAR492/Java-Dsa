// Take Positive integer input and print:
//----if number is divisible by 5
//----if number is divisible by 3
//----if number is divisible by 5 & 3 both
//----if number is not divisible by 5 & 3
package IfElseConditional;

import java.util.Scanner;

public class Divisiblebyfivethreeboth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a +ve integer:-");
        int num = sc.nextInt();
        if (num % 3 == 0 && num % 5 == 0) System.out.println(num+" is divisible by 3 and 5 both.");
        else if (num % 5 == 0) System.out.println(num+" is divisible by 5.");
        else if (num % 3 == 0) System.out.println(num+" is divisible by 3.");
        else System.out.println(num+" is not divisible by 5 or 3.");
    }

}
