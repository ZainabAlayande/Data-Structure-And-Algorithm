package org.example.graph;

import java.util.*;

public class BreadthFirstSearch {

    public static void main(String[] args) {
        Person alice = new Person("Alice");
        Person bob = new Person("Bob");
        Person candy = new Person("Candy");
        Person derek = new Person("Derek");
        Person elaine = new Person("Elaine");
        Person fred = new Person("Fred");
        Person gina = new Person("Gina");
        Person helen = new Person("Helen");
        Person irena = new Person("Irena");

        alice.addFriend(bob);
        alice.addFriend(candy);
        alice.addFriend(derek);
        alice.addFriend(elaine);

        bob.addFriend(fred);
        derek.addFriend(gina);
        fred.addFriend(helen);
        gina.addFriend(irena);

        alice.displayNetwork();
    }

    static class Person {
        private String name;
        private List<Person> friends;
        private boolean visited;

        public Person(String name) {
            this.name = name;
            this.friends = new ArrayList<>();
            this.visited = false;
        }

        public String getName() {
            return name;
        }

        public void addFriend(Person friend) {
            this.friends.add(friend);
        }


        public void displayNetwork() {
            List<Person> toReset = new ArrayList<>();

            Queue<Person> queue = new LinkedList<>();
            queue.add(this);
            this.visited = true;
            toReset.add(this);

            while (!queue.isEmpty()) {
                Person currentPerson = queue.poll();
                System.out.println(currentPerson.getName());

                for (Person friend : currentPerson.friends) {
                    if (!friend.visited) {
                        queue.add(friend);
                        friend.visited = true;
                        toReset.add(friend);
                    }
                }
            }

            for (Person person : toReset) {
                person.visited = false;
            }
        }
    }

}
