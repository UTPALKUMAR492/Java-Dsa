package Methods;

import java.util.Scanner;

public class MaxOfThreeBuiltIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Num:-");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Num:-");
        int b = sc.nextInt();
        System.out.println("Enter 3rd Num:-");
        int c = sc.nextInt();
        System.out.println("Greatest among all is :- "+Math.max(Math.max(a,b), c));
    }
}
