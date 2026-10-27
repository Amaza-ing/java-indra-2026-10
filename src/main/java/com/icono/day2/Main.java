package com.icono.day2;

public class Main {
    static void main() {
        System.out.println("Día 2");

//        BUCLES - LOOPS

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

        System.out.println("--------------------------");

        for (int i = 1; i <= 10; i++) {
            if (i == 4) break;

            System.out.println(i);
        }

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) continue;

            System.out.println(i);
        }

        System.out.println("--------------------------");

        int counter = 200;

        while (counter < 10) {
            System.out.println(counter);

            counter++;
        }

        counter = 100;

        do {
            System.out.println(counter);
            counter++;
        } while (counter < 10);
    }
}
