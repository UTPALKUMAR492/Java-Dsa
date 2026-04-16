package Pattern;

import java.util.Scanner;

public class NumSpiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int a = 1;
        for(int i = 1;i<=n;i++){
            for (int j = 1;j<=n;j++){
//                for(int k= 1; k<=n;k++) {
                    if (i == 1 || j == 1 || i == n || j == n)
                        System.out.print(n - n + 1 + " ");
                    else if (i == 2 || j == 2 || i == n - 1 || j == n - 1)
                        System.out.print(n - n + 2 + " ");
                    else
                        System.out.print(n - n + 3  + " ");
//                }
//                System.out.println();
            }


            System.out.println();
        }

    }
}
