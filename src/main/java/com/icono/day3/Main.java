package com.icono.day3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        System.out.println("Día 3");

//        LISTS ARRAYLIST

        List<String> countries = new ArrayList<>();

        System.out.println(countries);
        countries.add("España");
        countries.add("Perú");
        countries.add("México");
        System.out.println(countries);
        System.out.println(countries.size());
        System.out.println(countries.get(0));
        countries.set(0, "Venezuela");
        System.out.println(countries);
        countries.remove(1);
        System.out.println(countries);

        for (String country : countries) {
            System.out.println(country);
        }

        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i));
        }

        List<Integer> numberList = List.of(10, 20, 30, 40, 50);
        System.out.println(numberList);

//        CLASES Y OBJETOS - POO (PROGRAMACIÓN ORIENTADA A OBJETOS)

        Movie movie1 = new Movie("El Señor de los Anillos", 300);
        Movie movie2 = new Movie("Star Wars", 200);
        Movie movie3 = new Movie("Mad Max");
        Movie movie4 = new Movie();

        System.out.println(movie1);
        System.out.println("Película: " + movie1.getTitle() + ". Duración: " + movie1.getDuration() + "m.");
        System.out.println(movie2);
        System.out.println("Película: " + movie3.getTitle() + ". Duración: " + movie3.getDuration() + "m.");
        movie4.setTitle("Dune");
        movie4.setDuration(140);
        System.out.println("Película: " + movie4.getTitle() + ". Duración: " + movie4.getDuration() + "m.");

    }
}
