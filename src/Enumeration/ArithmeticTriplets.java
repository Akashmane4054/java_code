package Enumeration;

import java.util.HashMap;
import java.util.Map;

public class ArithmeticTriplets {
    public static int countArithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            int prev = num - diff;
            int currentCount = map.getOrDefault(prev, 0);
            count += currentCount;
            map.put(num, map.getOrDefault(num, 0) + currentCount);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 4, 6, 7, 10};
        int diff = 3;
        System.out.println(countArithmeticTriplets(nums, diff));
    }
}
