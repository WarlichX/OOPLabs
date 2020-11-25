package com.company;

import java.util.Stack;

public class ParenthesesValidator {

    static boolean isValidExpresion(String e) {

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < e.length(); i++) {
            char ch = e.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
                continue;
            }

            if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                else {
                    char removedParenthesis = stack.pop();
                    switch (ch) {
                        case ')':
                            if (removedParenthesis=='{' || removedParenthesis=='[') {
                                return false;
                            }
                            break;
                        case ']':
                            if (removedParenthesis=='{' || removedParenthesis=='(') {
                                return false;
                            }
                            break;
                        case '}':
                            if (removedParenthesis=='[' || removedParenthesis=='(') {
                                return false;
                            }
                            break;
                    }
                }
            }
        }
        return (stack.isEmpty());
    }

}
