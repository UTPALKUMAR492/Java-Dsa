//Ques: If cost price and Selling price of an item is input through the keyboard,
// write a program to determine whether the seller has made profit or incurred loss
// or no profit no loss he incurred.
package IfElseConditional;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cost Price of Item:-");
        int cost = sc.nextInt();
        System.out.println("Enter Selling Price of Item:-");
        int sell = sc.nextInt();
        if(cost > sell) System.out.println("Loss is "+(cost - sell));
        else if (sell > cost) System.out.println("Profit is "+(sell - cost));
        else System.out.println("Neither Profit Nor Loss.");
    }
}
