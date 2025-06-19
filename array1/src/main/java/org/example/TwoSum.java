package org.example;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        int length = nums.length;
        Map<Integer, Integer> diffMap = new HashMap<>();

        for(int i = 0; i < length ; i++ ) {
            int diff = target - nums[i];

            if(diffMap.containsKey(nums[i])) {
                return new int[]{diffMap.get(nums[i]), i};
            }
            diffMap.put(diff, i);
        }
        return null;
    }
}
