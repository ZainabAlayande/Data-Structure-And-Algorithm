package org.example.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphWithHashImpl {

    public static void main(String[] args) {
        Map<String, List<String>> friends = new HashMap<>();
        friends.put("Alice", List.of("Bob", "Diana", "Fred"));
        friends.put("Bob", List.of("Alice", "Cynthia", "Diana"));
        friends.put("Cynthia", List.of("Bob"));
        friends.put("Diana", List.of("Alice", "Diana", "Fred"));
        friends.put("Elie", List.of("Fred"));
        friends.put("Fred", List.of("Alice", "Diana", "Elie"));

        System.out.println("Alice's friends -- " + friends.get("Alice"));
    }





}
