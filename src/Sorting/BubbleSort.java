package Sorting;

public class BubbleSort {
    public static void print(int[] arr){
        for (int ele : arr) System.out.print(ele+" ");
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 4, 2, 0};

        print(arr);
        System.out.println();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        print(arr);

    }
}
