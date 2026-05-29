package Sorting;

public class CheckArraySorted {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,6      };
        boolean flag = true;
        for (int i = 0; i< arr.length;i++){
            for (int j = i+1; j< arr.length;j++){
                if (arr[i] > arr[j]) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag) System.out.println("Array is sorted");
        else System.out.println("Array is not sorted");
    }
}
