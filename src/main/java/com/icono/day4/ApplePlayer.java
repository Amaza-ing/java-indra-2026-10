package com.icono.day4;

public class ApplePlayer extends Player implements IPlayable {
    public ApplePlayer(double volume, int currentTrack) {
        super(volume, currentTrack);
    }

    @Override
    public void close() {
        System.out.println("Cerrando ApplePlayer");
    }

    @Override
    public void play() {
        System.out.println("Playing ApplePlayer");
    }

    @Override
    public void pause() {
        System.out.println("Pausing ApplePlayer");
    }

    @Override
    public void mute() {
        super.setVolume(0);
    }

    @Override
    public void increaseVolume() {
        super.setVolume(super.getVolume() + 0.2);

        if (super.getVolume() > MAX_VOLUME) super.setVolume(MAX_VOLUME);
    }
}
