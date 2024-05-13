package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseAStringWithStringBuilder {

    public static String StringChallenge(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = str.length() - 1; i >= 0 ; i--) {
            stringBuilder.append(str.charAt(i));
        }

        String res = stringBuilder.toString();
        System.out.println(res);
        // code goes here
        return RemoveString(stringBuilder.toString());
    }


    public static String RemoveString(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        String tokenChallenge = "uUhHiI3qQkKaA9eE";
        char[] tokenArray = tokenChallenge.toCharArray();
        char[] resultArray = str.toCharArray();

        boolean found;
        for (int i = 0; i < resultArray.length; i++) {
            found = false;
            for (int j = 0; j < tokenArray.length; j++) {
                if(resultArray[i] == tokenArray[j]) {
                    found = true;
                    break;
                }
            }

            if(!found) {
                stringBuilder.append(resultArray[i]);
            }
        }
        return stringBuilder.toString();
    }


    public static void main(String[] args) {
        System.out.println(StringChallenge("I Love Code"));
    }
}
