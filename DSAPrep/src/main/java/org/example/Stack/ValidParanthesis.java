package org.example.Stack;

import java.util.Stack;

public class ValidParanthesis {
    boolean validParantheses(char[] characters) {
        Stack<Character> stack = new Stack<>();

           for(char c: characters) {
              switch (c){
                  case '[':
                  case '{':
                  case '(':
                       stack.push(c);
                       break;
                  case ')' :
                       if(stack.peek().equals('(')) stack.pop();
                       else return false;
                       break;
                  case '}' :
                      if(stack.peek().equals('{')) stack.pop();
                      else return false;
                      break;
                  case ']' :
                      if(stack.peek().equals('[')) stack.pop();
                      else return false;
                      break;
              }
           }
            if(stack.empty()) return true;
            return false;
    }
}
