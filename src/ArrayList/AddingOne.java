package ArrayList;

import java.util.ArrayList;

public class AddingOne {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(8);
        arr.add(7);
        arr.add(9);

        int carry = 1;
        int n = arr.size();

        for (int i = n - 1; i >= 0; i--) {
            int sum = arr.get(i) + carry;
            arr.set(i, sum % 10);
            carry = sum / 10;
        }

        if (carry > 0) {
            arr.add(0, carry);
        }

        System.out.print("Result: ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
