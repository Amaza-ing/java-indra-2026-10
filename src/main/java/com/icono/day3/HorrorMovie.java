package com.icono.day3;

public class HorrorMovie extends Movie {
    private boolean hasScareJumps;

    public HorrorMovie(String title, int duration, boolean hasScareJumps) {
        super(title, duration);
        this.hasScareJumps = hasScareJumps;
    }

    public boolean hasScareJumps() {
        return hasScareJumps;
    }

    public void setHasScareJumps(boolean hasScareJumps) {
        this.hasScareJumps = hasScareJumps;
    }

    @Override
    public String toString() {
        return "HorrorMovie{" +
                "title: " + super.getTitle() +
                ", duration: " + super.getDuration() +
                ", hasScareJumps: " + hasScareJumps +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Precaución, estás viendo una película de miedo!");
        super.play();
    }

    public void getHorrorMovieInfo() {
        System.out.println("Título: " + super.getTitle());
    }
}
