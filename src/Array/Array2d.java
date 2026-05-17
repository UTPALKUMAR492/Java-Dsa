package Array;
import java.util.Scanner;
public class Array2d {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("enter the rows");
            int x = sc.nextInt();
            System.out.println("enter the columns");
            int y = sc.nextInt();
            int[][] arr = new int[x][y];
            System.out.println("enter the array");
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.println("Given Array:");
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("Snake Transformed Array:");
            for (int i = 0; i < x; i++) {
            if(i%2 != 0){

                    for (int j = arr.length-1; j >= 0 ; j--) {
                        System.out.print(arr[i][j]+" ");
                    }
                    System.out.println();
                }

            else {
                    for (int j = 0; j < y; j++) {
                        System.out.print(arr[i][j]+" ");
                    }
                    System.out.println();
                }
            }

        }
    }

