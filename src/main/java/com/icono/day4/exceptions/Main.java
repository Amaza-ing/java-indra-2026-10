package com.icono.day4.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    static void main() {
        System.out.println("Excepciones");

//        CHECKED EXCEPTIONS

        String fileName = "file.txt";
        readFile(fileName);

//        UNCHECKED EXCEPTIONS

        String name = null;
        printLength(name);

//        THROWS

//        int[] numbers = {1, 2, 3, 4, 5};
        int[] numbers = null;

        try {
            printArray(numbers);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Te has salido de los límites del array");
        } catch (NullPointerException e) {
            System.out.println("El array no puede ser nulo");
        } catch (Exception e) {
            System.out.println("Error inesperado");
        }

//        THROWING EXCEPTIONS

        int a = 900000000;
        int b = 400000000;

        try {
            int product = multiply(a, b);
            System.out.println(product);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("Utilizando la versión con long...");
            long longProduct = multiply((long) a,(long) b);
            System.out.println(longProduct);
        }
    }

    public static void readFile(String fileName) {
        try {
            FileReader reader = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Error al abrir el archivo " + fileName);
        } catch (Exception e) {
            System.out.println("Error inesperado");
        }
    }

    public static void printLength(String myString) {
        try {
            System.out.println(myString.length());
        } catch (NullPointerException e) {
            System.out.println("El String no puede ser nulo");
        }
    }

    public static void printArray(int[] numArray) throws ArrayIndexOutOfBoundsException {
        for (int i = 0; i <= numArray.length; i++) {
            System.out.println(numArray[i]);
        }
    }

    public static int multiply(int a, int b) {
        int product = a * b;

        if (product / a != b) {
            throw new ArithmeticException("El producto es demasiado grande para un int");
        }

        return product;
    }

    public static long multiply(long a, long b) {
        return a * b;
    }
}
