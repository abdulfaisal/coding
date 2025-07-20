package org.example.TwoPointer;

public class Main {
    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        System.out.println(" " + validPalindrome.isPalindrome(" "));
        System.out.println("a " + validPalindrome.isPalindrome("a"));
        System.out.println("malayalam "+ validPalindrome.isPalindrome("malayalam"));
        System.out.println("kafka " + validPalindrome.isPalindrome("kafka"));
        System.out.println("kaak " + validPalindrome.isPalindrome("kaak"));
        System.out.println("Was it a car or a cat I saw?" + validPalindrome.isPalindrome("Was it a car or a cat I saw?"));
        System.out.println("tab a cat" + validPalindrome.isPalindrome("tab a cat"));

        System.out.println("0P" + validPalindrome.isPalindrome("0P"));
    }
}
