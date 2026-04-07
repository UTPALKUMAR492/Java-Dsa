package Pattern;
import java.util.Scanner;

public class AlpCapSqPattern2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Num:- ");
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print((char)(i+65)+" ");
            }
            System.out.println();
        }
    }
}
