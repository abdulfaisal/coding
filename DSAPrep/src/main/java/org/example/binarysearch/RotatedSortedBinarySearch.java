package org.example.binarysearch;

class RotatedSortedBinarySearch {
    public int findMinOn(int[] nums) {

        int mid = 0;
        int min = nums[0];
        while( mid<nums.length-1) {
            if(nums[mid] < nums[mid+1]) ;
            else {
                min = nums[mid + 1];
                break;
            }
            mid++;
        }

        return min;

    }

    public int binSearchMin(int[] nums) {

//        3,4,5,6,1,2

        int l = 0;
        int r = nums.length -1;

        while(l<r) {
            int mid = l + (r-l)/2;
            if(nums[mid] < nums[r]) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return nums[l];
    }
}