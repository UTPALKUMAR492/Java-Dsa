//Display this AP - 2,5,8,11.. upto ‘n’ terms
//For nth terms, an = a + (n-1)d  e.g 2 + (n-1) * 3 = 3n - 1
package Loop;

import java.util.Scanner;
public class ArithmeticProgression {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nth terms of AP:-");
        int n = sc.nextInt();
        for(int i = 2;i <= 3*n-1;i+=3){
            System.out.print(i+ ", ");
        }

//        int a =2, d =3;
//        for(int i = 1;i<=10;i++){
//            System.out.print(a+" ");
//            a += d;
//        }
        System.out.print("\b\b.");
    }
}
