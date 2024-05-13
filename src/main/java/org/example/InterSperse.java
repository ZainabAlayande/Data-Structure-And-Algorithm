package org.example;

public class InterSperse {

    public static StringBuilder intersperse(String character, String tokenChallenge) {
        StringBuilder stringBuilder = new StringBuilder();
        int characterCount = 0;
        int tokenCount = 0;
        int totalLength = character.length() + tokenChallenge.length();

        for (int i = 0; i < totalLength; i++) {
            if (i % 2 == 1) {
                stringBuilder.append(tokenChallenge.charAt(tokenCount));
                tokenCount++;
            } else {
                stringBuilder.append(character.charAt(characterCount));
                characterCount++;

                if (stringBuilder.substring(stringBuilder.length() - 1).equals(character.substring(character.length() - 1))) {
                    int j;
                    for (j = tokenCount; j < tokenChallenge.length(); j++) {
                        stringBuilder.append(tokenChallenge.charAt(j));
                    }
                    break;
                }
            }
        }
        return stringBuilder;
    }
}
