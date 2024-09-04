package org.example.graph;

import java.util.HashMap;
import java.util.Map;

public class WeightedGraph {

    public static void main(String[] args) {
        City dallas = new City("Dallas");
        City toronto = new City("Toronto");

        dallas.addRoutes(dallas.name, 138);
        toronto.addRoutes(toronto.name, 216);

        System.out.println("Dallas price: $" + dallas.getRoutePrices(dallas.name));
        System.out.println("Toronto price: $" + toronto.getRoutePrices(toronto.name));
    }

    static class City {

        private String name;
        private Map<String, Integer> routes;

        public City(String name) {
            this.name = name;
            this.routes = new HashMap<>();
        }

        public void addRoutes(String city, Integer price) {
            routes.put(city, price);
        }

        public Integer getRoutePrices(String city) {
            return routes.get(city);
        }



    }

}
