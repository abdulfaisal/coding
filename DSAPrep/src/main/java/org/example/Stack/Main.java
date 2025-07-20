package org.example.Stack;

public class Main {
    public static void main(String[] args) {
        ValidParanthesis validParanthesis = new ValidParanthesis();

        System.out.println(validParanthesis.validParantheses("([{}])".toCharArray()));
        System.out.println(validParanthesis.validParantheses("[(])".toCharArray()));
    }
}
