package Pattern;
import java.util.Scanner;

public class StarFlippedTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
//            int a = n;
//        for(int i = 1; i<=n;i++){
//            for(int j = 1;j<=a;j++){
//                System.out.print(j+" ");
//            }
//            a--;
//            System.out.println();


//            for(int j = n; j>= i;j--){
            for(int j=1;j<=n+1-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
