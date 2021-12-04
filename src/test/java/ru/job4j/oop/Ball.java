package ru.job4j.oop;

public class Ball {
    public void tryRun(boolean condition) {
        if (condition == true) {
            System.out.println("Ball escaped");
        }
        else {
            System.out.println("Ball was eaten");
        }
    }
}
