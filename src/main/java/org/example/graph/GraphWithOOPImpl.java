package org.example.graph;

import java.util.ArrayList;
import java.util.Arrays;

public class GraphWithOOPImpl {

    public static void main(String[] args) {
        Person mary = new Person("Mary");
        Person peter = new Person("Peter");

        mary.addFriend("Peter");
        peter.addFriend("Mary");

        System.out.println(Arrays.toString(mary.getFriend()));
        System.out.println(Arrays.toString(peter.getFriend()));


    }

    static class Person {
        private String name;
        private int length;
        private String[] friends;

        public Person(String name) {
            this.name = name;
        }

        public void addFriend(String friend) {
            friends = new String[length + 1];
            friends[length] = friend;
            length++;
        }

        public String[] getFriend() {
            return friends;
        }


    }
}
