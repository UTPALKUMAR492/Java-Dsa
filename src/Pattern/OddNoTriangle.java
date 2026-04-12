package Pattern;

import java.util.Scanner;

public class OddNoTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        for(int i =1;i<=n;i++){
//            for(int j = 1;j<=i;j++){
//                System.out.print(2*j-1 +" ");
//            }
//            System.out.println();
//        }



        for(int i =1;i<=n;i++){
            int a=1;
            for(int j = 1;j<=i;j++){
                System.out.print(a +" ");
                a+=2;
            }

            System.out.println();
        }


//        for(int i = 1;i<=n+n; i+=2){
//            for(int j = 1;j<=i; j++){
//                if((j%2) != 0) {
//                    System.out.print(j+" ");
//                }
//            }
//            System.out.println();
//        }
    }
}
