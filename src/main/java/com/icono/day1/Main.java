package com.icono.day1;

public class Main {
    static void main() {
        System.out.println("Hola mundo!");

        // TIPOS DE DATOS PRIMITIVOS - PRIMITIVE DATA TYPES

        byte myByte = 127;
        short myShort = 1000;
        int myInt = 10000;
        long myLong = 1_000_000L;
        float myFloat = 1.234f;
        double myDouble = 9.876;
        boolean myBool = true;
        char myChar = 'a';
        char myChar2 = 97;

        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(myInt);
        System.out.println(myLong);
        System.out.println(myFloat);
        System.out.println(myDouble);
        System.out.println(myBool);
        System.out.println(myChar);
        System.out.println(myChar2);

        myInt = 99;
        System.out.println("myInt = " + myInt);

        final double PI_VALUE = 3.1416;
        System.out.println("Pi = " +  PI_VALUE);

//        STRINGS

        String myString = "Soy un String";
        System.out.println("myString = " + myString);

//        OPERADORES

        int number = 10;
        double doubleNumber = 10.0;

        int result = number + 5;
        System.out.println("result = " + result);

        System.out.println(number + 5);
        System.out.println(number - 5);
        System.out.println(number * 5);
        System.out.println(number / 3);
        System.out.println(doubleNumber / 3);
        System.out.println(1.1 + 1.3);
        System.out.println(number % 7);

        number = number + 5;
        System.out.println(number);

        number = 10;

        number += 5;
        System.out.println(number);

        number -= 5;
        System.out.println(number);

        number *= 5;
        System.out.println(number);

        number /= 5;
        System.out.println(number);

        number += 1;
        System.out.println(number);

        number -= 1;
        System.out.println(number);

        number++;
        System.out.println(number);

        number--;
        System.out.println(number);

        ++number;
        System.out.println(number);

        --number;
        System.out.println(number);

        System.out.println(number++);
        System.out.println(number);
        System.out.println(++number);

        number = 10;

//        OPERADORES LÓGICOS

        System.out.println(number == 10);
        System.out.println(number != 10);
        System.out.println(number > 20);
        System.out.println(number < 20);
        System.out.println(number >= 10);
        System.out.println(number <= 10);

//        DESBORDAMIENTO

        myByte++;
        System.out.println(myByte);

//        CASTING (cambiar de tipo de dato)

        number = 10;
        int number2 = 3;

        double divResult = (double) number / number2;
        System.out.println("divResult = " + divResult);

        char letter = 'ñ';
        int code = (int) letter;
        System.out.println("letter code = " + code);

        String text = "40";
        int userAge = Integer.parseInt(text);
        System.out.println("userAge = " + userAge);

        String price = "19.99";
        double productPrice = Double.parseDouble(price);
        productPrice *= 1.21;
        System.out.println("price = " + productPrice);

        int age = 30;
        String ageStr = String.valueOf(age);
        System.out.println("age = " + ageStr);

        String ageString = age + "";
        System.out.println("ageString = " + ageString);

//        CONDICIONALES

        int score = 75;

        if (score > 90) {
            System.out.println("Sobresaliente");
        } else if (score > 80) {
            System.out.println("Notable alto");
        } else if (score > 70) {
            System.out.println("Notable bajo");
        } else if (score >= 50) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Suspenso");
        }

        number = 50;

        if (number % 2 == 0) {
            System.out.println(number + " es par");
        } else {
            System.out.println(number + " es impar");
        }

        age = 20;
        boolean hasId = false;

        if (age >= 18 && hasId) {
            System.out.println("Puedes pasar");
        } else {
            System.out.println("No puedes pasar");
        }

        boolean isVip = false;
        boolean hasInvitation = true;

        if (isVip || hasInvitation) {
            System.out.println("Puedes pasar al teatro");
        }  else {
            System.out.println("No puedes pasar al teatro");
        }

        boolean isBlocked = false;

        if (!isBlocked) {
            System.out.println("El usuario no está bloqueado");
        }

        boolean isOlder = age >= 18;
        boolean isAllowed = isVip || hasInvitation;
        boolean canPass = isOlder && isAllowed && !isBlocked;

        if (canPass) {
            System.out.println("Puedes pasar!!!!");
        }
    }
}
