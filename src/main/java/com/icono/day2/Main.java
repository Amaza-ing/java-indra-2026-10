package com.icono.day2;

import com.icono.day3.Movie;

import java.util.Arrays;

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

//        MÉTODOS DE LOS STRINGS

        String address = "C/ Gran Vía, 10, 2B";
        System.out.println(address.length());
        System.out.println(address.toLowerCase());
        System.out.println(address);
        System.out.println(address.toUpperCase().replace("A", "-"));

        String fruits = String.join(", ", "Orange", "Apple", "Banana");
        System.out.println(fruits);

//        ENVOLTORIO - WRAPPER

        int number = 1; // los tipos de datos primitivos no son nullables ni tienen métodos

        Integer myInteger = 10;
        System.out.println(myInteger);

        Byte myByte = 127;
        Short myShort = 1000;
        Long myLong = 10000L;
        Float myFloat = 1.23F;
        Double myDouble = 9.876;
        Boolean myBoolean = true;
        Character myCharacter = 'a';

        Integer num2 = null;

        String text = "50";
        String text2 = "15.72";

        Integer textToInt = Integer.parseInt(text);
        Double textToDouble = Double.parseDouble(text2);

        System.out.println(textToInt);
        System.out.println(textToDouble);

//        SOBRECARGA DE MÉTODOS - METHOD OVERLOAD

        int intResult1 = sum(10, 20);
        System.out.println(intResult1);

        int intResult2 = sum(10, 20, 30);
        System.out.println(intResult2);

        double doubleResult = sum(10.5, 4.3);
        System.out.println(doubleResult);

        int squareArea = calculateArea(5);
        System.out.println(squareArea);

        int rectangleArea = calculateArea(10, 4);
        System.out.println(rectangleArea);

        System.out.println(getUserInfo("María", 25));
        System.out.println(getUserInfo(30, "Alberto"));

//        ARRAYS

        String[] days = {"lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo"};
        System.out.println(days);
        System.out.println(Arrays.toString(days));
        System.out.println(days[0]);
        System.out.println(days[3].toUpperCase());
        System.out.println(days.length);
        System.out.println(days[days.length - 1]);
//        System.out.println(days[days.length]); // Arrays Index Out of Bounds Exception

        int subjectsSize = 5;
        String[] subjectArray = createSubjectArray(subjectsSize);

        System.out.println(Arrays.toString(subjectArray));

//        Arrays: bucle for

        for (int i = 0; i < subjectArray.length; i++) {
            System.out.println(subjectArray[i]);
        }

//        Arrays: bucle foreach

        for (String subject : subjectArray) {
            System.out.println(subject);
        }

//        Usar una clase de fuera de este paquete

        Movie movie = new Movie("La Naranja Mecánica", 120);
        System.out.println(movie.getTitle());


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

    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    public static int calculateArea(int length) {
        return length * length;
    }

    public static int calculateArea(int length, int width) {
        return length * width;
    }

    public static String getUserInfo(String name, int age) {
        return name + ", " + age;
    }

    public static String getUserInfo(int age, String name) {
        return age + ", " + name;
    }

    public static String[] createSubjectArray(int size) {
        String[] subjects = new String[size];

        subjects[0] = "Matemáticas";
        subjects[1] = "Lengua";
        subjects[2] = "Historia";
        subjects[3] = "Biología";
        subjects[4] = "Química";

        return subjects;
    }
}
