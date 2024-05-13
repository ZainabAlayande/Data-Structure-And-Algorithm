package org.example;

import java.util.List;
import java.util.Stack;

public class Linter {

    private static final Stack<String> stack = new Stack<>();
    private static final List<String> openingBraces = List.of("(", "{", "[");
    private static final List<String> closingBraces = List.of(")", "}", "]");

    public static String lint(String statement) {
        // (var x = {y: [1, 2, 3]})
        for (int i = 0; i < statement.length(); i++) {
            if (String.valueOf(statement.charAt(i)).contains(openingBraces.get(i))) {
                stack.push(String.valueOf(statement.charAt(i)));
            }
            else if (String.valueOf(statement.charAt(i)).contains(closingBraces.get(i))) {
                if (closingBracesCorrespondWithTheLastElementInTheStack(statement.charAt(i))) {
                    stack.pop();
                } else {
                    return String.format("Incorrect closing braces: %s at index %s", statement.charAt(i), i);
                }

            }
        }

        if (!stack.isEmpty()) {
            return String.format("Line %s does not have a closing bracket", 3);
        }
        return null;
    }

    private static boolean closingBracesCorrespondWithTheLastElementInTheStack(char braces) {
        String lastElementInTheStack = stack.lastElement();
        int indexOfLastElementInTheStack = stack.indexOf(lastElementInTheStack);
        for (int i = 0; i < closingBraces.size(); i++) {
            if (String.valueOf(braces).contains(closingBraces.get(i)) && i == indexOfLastElementInTheStack) {
                return true;
            }
        }
        return false;
    }

    public static void printStack(){
        System.out.println("The Stack == " + stack);
    }
}
