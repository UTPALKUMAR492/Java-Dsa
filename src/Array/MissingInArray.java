
package Array;

import java.util.Arrays;

public class MissingInArray {
    public static void main(String[] args) {
        int[] arr = {8,2,4,5,3,7,1};
        int n = arr.length+1;
        Arrays.sort(arr);
        int i = 0, j = n-1;
        int r = 1;
        int target = -1;
        while (i < j){
            if(arr[i] != r) {
                target = r;
                break;
            }
            i++;
            r++;
        }
        if (target == -1) {
            target = n;
        }
        System.out.println(target);

    }
}
