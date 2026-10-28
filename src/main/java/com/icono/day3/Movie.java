package com.icono.day3;

import java.util.Objects;

public class Movie {
    private String title;
    private int duration;
    private static final String MESSAGE = "Disfruta de esta película!";

    public Movie() {
    }

    public Movie(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public Movie(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return duration == movie.duration && Objects.equals(title, movie.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, duration);
    }

    public void play() {
        System.out.println("Ahora estamos viendo " + this.title);
    }

    public static void displayMessage() {
        System.out.println(MESSAGE);
    }
}
