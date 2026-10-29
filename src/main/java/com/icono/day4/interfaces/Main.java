package com.icono.day4.interfaces;

import com.icono.day3.Movie;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
//        Player player = new Player(0.1, 1);
//        System.out.println(player.getVolume());

        Movie movie = new Movie("Harry Potter", 120);

        WebPlayer webPlayer = new WebPlayer(0.2, 2);
        System.out.println(webPlayer.getVolume());
        webPlayer.showMovieInfo(movie);
        webPlayer.close();

        ApplePlayer applePlayer = new ApplePlayer(0.3, 3);
        applePlayer.increaseVolume();
        applePlayer.increaseVolume();
        applePlayer.increaseVolume();
        applePlayer.increaseVolume();
        System.out.println(applePlayer.getVolume());
        applePlayer.showMovieInfo(movie);
        applePlayer.close();

        AndroidPlayer androidPlayer = new AndroidPlayer(0.4, 4);
        System.out.println(androidPlayer.getVolume());
        System.out.println(androidPlayer.share(movie));
        androidPlayer.showMovieInfo(movie);
        androidPlayer.close();

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
//        numbers.add("Patata"); // las listas sólo aceptan un tipo de dato

        List<WebPlayer> webPlayers = new ArrayList<>();
        webPlayers.add(webPlayer);
//        webPlayers.add(applePlayer); // las listas sólo aceptan un tipo de dato

        List<Player> players = new ArrayList<>();
        players.add(androidPlayer);
        players.add(applePlayer);
        players.add(webPlayer);
        System.out.println(players);

        for (Player player : players) {
            player.close();
        }
    }
}
