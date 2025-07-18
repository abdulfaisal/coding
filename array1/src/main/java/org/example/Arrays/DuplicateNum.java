package org.example.Arrays;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNum {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();

        for(int i=0; i < nums.length;i++) {
            if(map.containsKey(nums[i])) return true;
            map.put(nums[i],true);
        }
        return false;
    }
}
