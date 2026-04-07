package Pattern;

import java.util.Scanner;

public class HollowStarRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        for(int i = 1; i<=r; i++){
            for(int j = 1; j<=c; j++){
                if(i==1 || j==1 || j==c || i==r){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }
}
