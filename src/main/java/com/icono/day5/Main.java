package com.icono.day5;

import com.icono.day3.Movie;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Main {
    static void main() {

//        ENUMS

        User user = new User("Adrián");
        System.out.println(user);
        user.setStatus(Status.OFFLINE);
        System.out.println(user);

        Category category = Category.SILVER;
        System.out.println("Categoría: " + category + ", Puntos: " + category.POINTS);

//        MAPS

        Map<String, String> users = new HashMap<>();

        users.put("xx001", "Adrián Maza");
        users.put("yy002", "Beatriz López");
        users.put("zz003", "Carlos Martín");

        System.out.println(users);
        System.out.println(users.get("xx001"));

        users.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });

        Movie movie1 = new Movie("El Señor de los Anillos", 300);
        Movie movie2 = new Movie("Harry Potter", 200);
        Movie movie3 = new Movie("Dune", 100);

        Map<String, Movie> movies = new HashMap<>();
        movies.put("ESDLA", movie1);
        movies.put("HP", movie2);
        movies.put("D", movie3);

        System.out.println(movies);
        System.out.println(movies.get("ESDLA"));
        System.out.println(movies.get("HP").getTitle());

        Map<String, Movie> movies2 = new LinkedHashMap<>();
        movies2.put("ESDLA", movie1);
        movies2.put("HP", movie2);

        System.out.println(movies2);
        System.out.println(movies2.get("ESDLA"));
        System.out.println(movies2.get("HP").getTitle());

        Map<String, Movie> movies3 = new TreeMap<>();

//        SET

        Set<String> names = new HashSet<>();

        names.add("Alberto");
        names.add("Beatriz");
        names.add("Carlos");
        names.add("Alberto");

        System.out.println(names);

//        BIGDECIMAL

        System.out.println(1.2 - 1.0);

        BigDecimal bd1 = new BigDecimal("10.2534523452345234");
        BigDecimal bd2 = new BigDecimal("10.2534523452345234");

        System.out.println(bd1.subtract(bd2));
        System.out.println(bd1.add(bd2));
        System.out.println(bd1.multiply(bd2));
        System.out.println(bd1.divide(bd2, 2, RoundingMode.HALF_EVEN));

        if (bd1.compareTo(bd2) > 0) System.out.println("bd1 es mayor que bd2");
        else if (bd1.compareTo(bd2) < 0) System.out.println("bd1 es menor que bd2");
        else if (bd1.compareTo(bd2) == 0) System.out.println("bd1 es igual que bd2");
    }
}
