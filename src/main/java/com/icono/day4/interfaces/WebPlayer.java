package com.icono.day4.interfaces;

public class WebPlayer extends Player {
    public WebPlayer(double volume, int currentTrack) {
        super(volume, currentTrack);
    }

    @Override
    public void close() {
        System.out.println("Cerrando WebPlayer");
    }
}
