package Pattern;

import java.util.Scanner;

public class NumberSpiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n;i++){
            for (int j =1; j<= i;j++){
                if(j == n)continue;
                System.out.print(j+" ");
            }
            for (int k = 1;k<=2*n - 2*i - 1; k++){
                System.out.print(i+" ");
            }
            for (int l = i; l>= 1;l--){
                System.out.print(l+" ");
            }
            System.out.println();
        }
        for(int a = 1; a<=n-1;a++){
            for(int b = 1;b<=n-a ;b++){
                System.out.print(b+" ");
            }
            for(int c = 1; c<=2*a - 1;c++){
                System.out.print((n-a)+" ");
            }
            for(int d = n-a;d>=1;d--){
                System.out.print(d+" ");
            }
            System.out.println();
        }
    }
}
