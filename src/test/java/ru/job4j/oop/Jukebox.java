package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        String song;
        if (position == 1) {
            song = "Пусть бегут неуклюже";
        } else if (position == 2) {
            song = "Спокойной ночи";
        } else {
            song = "Песня не найдена";
        }
        System.out.println(song);
    }

    public static void main(String[] args) {
        Jukebox jb1 = new Jukebox();
        jb1.music(1);
        jb1.music(2);
        jb1.music(3);
    }
}
