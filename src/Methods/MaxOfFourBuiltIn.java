package Methods;

import java.util.Scanner;

public class MaxOfFourBuiltIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Num:-");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Num:-");
        int b = sc.nextInt();
        System.out.println("Enter 3rd Num:-");
        int c = sc.nextInt();
        System.out.println("Enter 4th Num:-");
        int d = sc.nextInt();
        System.out.println("Maximum among all four :2" +Math.max(Math.max(Math.max ( a,b),c),d));

    }
}
