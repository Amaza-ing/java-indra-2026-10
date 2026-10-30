package com.icono.day3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
    private String title;
    private int duration;
    private static final String MESSAGE = "Disfruta de esta película!";

    public Movie(String title) {
        this.title = title;
    }

    public void play() {
        System.out.println("Ahora estamos viendo " + this.title);
    }

    public static void displayMessage() {
        System.out.println(MESSAGE);
    }
}
