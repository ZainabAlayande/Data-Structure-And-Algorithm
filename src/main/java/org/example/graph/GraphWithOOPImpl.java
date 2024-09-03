package org.example.graph;

import java.util.ArrayList;
import java.util.List;

public class GraphWithOOPImpl {

    public static void main(String[] args) {
        Person mary = new Person("Mary");
        Person peter = new Person("Peter");

        mary.addFriend(peter);
        peter.addFriend(mary);

        System.out.println(mary.getName() + "'s friends: " + mary.getFriendNames());
        System.out.println(peter.getName() + "'s friends: " + peter.getFriendNames());
    }

    static class Person {
        private String name;
        private List<Person> friends;

        public Person(String name) {
            this.name = name;
            this.friends = new ArrayList<>();
        }

        public void addFriend(Person friend) {
            friends.add(friend);
        }

        public String getName() {
            return name;
        }

        public List<String> getFriendNames() {
            List<String> friendNames = new ArrayList<>();
            for (Person friend : friends) {
                friendNames.add(friend.getName());
            }
            return friendNames;
        }
    }
}
