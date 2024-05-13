package org.example;

import java.util.Stack;

public class ReverseAString {

    public static String reverseStringWithStack(String string) {
        Stack<String> stack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            stack.push(String.valueOf(string.charAt(i)));
        }

        for (int i = stack.capacity() - 1; i > 0; i--) {
            System.out.print(stack.get(i));
        }

        System.out.println(stack);

        return "";

    }
}
