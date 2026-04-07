package Loop;

import java.util.Scanner;

public class EvenNumtillRange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a +ve Range:-");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            if(i%2==0) {
                System.out.print(i+ " ");
            }
        }
    }
}
