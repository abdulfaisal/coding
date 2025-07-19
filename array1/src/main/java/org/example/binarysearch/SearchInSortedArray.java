package org.example.binarysearch;

public class SearchInSortedArray {

    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int m = (l + r) / 2;
        while (l < r) {
            m = (l + r) / 2;
            if (nums[m] > nums[r]) {
                l = m + 1;
            } else {
                r = m;
            }
        }



        int result = binarySearch(nums, target, 0, l-1);
        if (result != -1) {
            return result;
        }

        return binarySearch(nums, target, l, nums.length - 1);
    }

    public int binarySearch(int[] nums, int target, int left, int right) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
