package org.example.slidingwindow;



public class Main {
    public static void main(String[] args) {
        LongestSubstring longestSubstring = new LongestSubstring();
        System.out.println("zxyzxyz " + longestSubstring.lengthOfLongestSubstring("zxyzxyz"));
        System.out.println("xxxx " + longestSubstring.lengthOfLongestSubstring("xxxx"));
        System.out.println("au " + longestSubstring.lengthOfLongestSubstring("au"));

        System.out.println("zxyzxyz " + longestSubstring.lengthSlidingSoln("zxyzxyz"));
    }
}
