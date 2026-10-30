package com.icono.day4.interfaces;

import com.icono.day3.Movie;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class AndroidPlayerTest {

    @Test
    void constructorSetsInitialValues() {
        AndroidPlayer androidPlayer = new AndroidPlayer(0.5, 1);

        assertEquals(0.5, androidPlayer.getVolume());
        assertEquals(1, androidPlayer.getCurrentTrack());
    }

    @Test
    void closePrintsMessage() {
        assertOutput("Cerrando AndroidPlayer", () -> new AndroidPlayer(0.5, 1).close());
    }

    @Test
    void playPrintsMessage() {
        assertOutput("Playing AndroidPlayer", () -> new AndroidPlayer(0.5, 1).play());
    }

    @Test
    void pausePrintsMessage() {
        assertOutput("Pausing AndroidPlayer", () -> new AndroidPlayer(0.5, 1).pause());
    }

    @Test
    void muteSetsVolumeToZero() {
        AndroidPlayer androidPlayer = new AndroidPlayer(0.5, 1);

        androidPlayer.mute();

        assertEquals(0, androidPlayer.getVolume());
    }

    @Test
    void increaseVolumeAddsPointOne() {
        AndroidPlayer androidPlayer = new AndroidPlayer(0.5, 1);

        androidPlayer.increaseVolume();

        assertEquals(0.6, androidPlayer.getVolume(), 0.000001);
    }

    @Test
    void increaseVolumeDoesNotExceedMaximum() {
        AndroidPlayer androidPlayer = new AndroidPlayer(0.95, 1);

        androidPlayer.increaseVolume();

        assertEquals(IPlayable.MAX_VOLUME, androidPlayer.getVolume());
    }

    @Test
    void shareReturnsMovieTitle() {
        Movie movie = new Movie("Matrix", 120);
        AndroidPlayer androidPlayer = new AndroidPlayer(0.5, 1);

        assertEquals("Compartiendo Matrix", androidPlayer.share(movie));
    }

    private void assertOutput(String expected, Runnable action) {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        try (PrintStream capturedOut = new PrintStream(output)) {
            System.setOut(capturedOut);
            action.run();
        } finally {
            System.setOut(originalOut);
        }

        assertEquals(expected + System.lineSeparator(), output.toString());
    }
}