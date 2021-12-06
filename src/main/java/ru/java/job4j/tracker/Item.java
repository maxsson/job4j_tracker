package ru.java.job4j.tracker;

public class Item {
    private int id;
    private String name;

    public Item(int id) {
        this.id = id;
    }

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Item(String name) {
        this.name = name;
    }
}
