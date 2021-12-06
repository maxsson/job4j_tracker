package ru.java.oop;

public class Ball {
    public void tryRun(boolean condition) {
        if (condition) {
            System.out.println("Ball escaped");
        } else {
            System.out.println("Ball was eaten");
        }
    }
}
