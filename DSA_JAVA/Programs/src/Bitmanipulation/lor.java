package Bitmanipulation;

import java.util.List;

public class lor {
    public static void main(String[] args) {
        List<Integer> arr = List.of(1, 2, 3, 4, 6);
        System.out.println(balancedSum(arr));

    }

    public static int balancedSum(List<Integer> arr) {
        // Write your code here
        int sum = 0;
        int leftSum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        for (int i = 0; i < arr.size(); i++) {
            sum -= arr.get(i);
            if (leftSum == sum) {
                return i;
            }
            leftSum += arr.get(i);
        }
        return -1;

    }
}
