package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.message = message;
        this.status = status;
    }

    public void show() {
        System.out.println("Действие: " + active);
        System.out.println("Сообщение: " + message);
        System.out.println("Статус: " + status);
    }

    public static void main(String[] args) {
        Error er1 = new Error();
        er1.show();
        Error er2 = new Error(true, 1, "Досвbдули");
        er2.show();
    }
}
