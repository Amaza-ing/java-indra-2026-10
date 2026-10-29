package com.icono.day4;

import com.icono.day3.Movie;

public class AndroidPlayer extends Player implements IPlayable, IShareable {
    public AndroidPlayer(double volume, int currentTrack) {
        super(volume, currentTrack);
    }

    @Override
    public void close() {
        System.out.println("Cerrando AndroidPlayer");
    }

    @Override
    public void play() {
        System.out.println("Playing AndroidPlayer");
    }

    @Override
    public void pause() {
        System.out.println("Pausing AndroidPlayer");
    }

    @Override
    public void mute() {
        super.setVolume(0);
    }

    @Override
    public void increaseVolume() {
        super.setVolume(super.getVolume() + 0.1);

        if (super.getVolume() > MAX_VOLUME) super.setVolume(MAX_VOLUME);
    }

    @Override
    public String share(Movie movie) {
        return "Compartiendo " + movie.getTitle();
    }
}
