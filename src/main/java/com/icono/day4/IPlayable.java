package com.icono.day4;

public interface IPlayable {
    final double MAX_VOLUME = 1.0;

    public abstract void play();
    void pause();
    void mute();
    void increaseVolume();
}
