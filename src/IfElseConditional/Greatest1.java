package IfElseConditional;

import java.util.Scanner;

public class Greatest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number:-");
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd Number:-");
        int n2 = sc.nextInt();
        System.out.println("Enter 3rd Number:-");
        int n3 = sc.nextInt();
        int gr = n1;
        if(gr<n2){
            gr = n2;//System.out.println("Greater: "+gr);
        }
        else{
            gr = n3;
        }
        System.out.println("Greatest: "+gr);
    }
}
