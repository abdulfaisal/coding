package org.example.TwoPointer;

public class ValidPalindrome {
    boolean isPalindrome(String search) {
        char[] str = search.toLowerCase().toCharArray();
        String check = "";
        for(char c:str) {
            if((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) check += c;
        }
        int len = check.length();
        str = check.toCharArray();
        int limit = len/2 ;
        if(len%2 !=0) {
           limit +=1;
        }

        if(limit == 0 ) return true;
        int i = 0;
        int count = 0;

        while(i < limit) {
            if( str[i]== str[len-1-i]) {
                ++count;
            }
            i++;
        }
        if(count == limit) {
            return true;
        }
        return false;
    }
}
