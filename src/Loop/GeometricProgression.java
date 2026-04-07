//Ques: Display this GP - 1,2,4,8.. upto ‘n’ terms
// For GP, an = a * r^(n-1)
package Loop;
import java.util.Scanner;
public class GeometricProgression {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Terms of GP:-");
        int n = sc.nextInt();
        int a =1, r = 2;
        for(int i =1; i<=n; i++){
            System.out.print(a+" ");
            a *= r;
        }
    }
}
