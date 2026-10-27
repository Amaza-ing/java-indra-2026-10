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

        System.out.println("--------------------------");

//        MÉTODOS - METHODS

        myMethod();
        myMethod();
        myMethod();

        String info = getInfo(10);
        System.out.println(info);

        int sumResult = sum(2, 3);
        System.out.println(sumResult);
        System.out.println(sum(10, 90));


    }

    public static void myMethod() {
        System.out.println("Hola");
        System.out.println("desde");
        System.out.println("el");
        System.out.println("método");
        System.out.println("myMethod");
    }

    public static String getInfo(int option) {
        String info = "";

        if (option == 1) info = "Eres el usuario: Adrián";
        else if (option == 2) info = "Esto es un curso de Java";
        else info = "La opción " + option + " no existe";

        return info;
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }
}
