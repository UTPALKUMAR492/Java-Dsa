package Pattern;
import java.util.Scanner;
public class AlpCapSqPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num.:- ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(((char)(j+65))+" ");
            }
            System.out.println();
        }
    }
}
