package ru.java.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Max");
        student.setGroup("Kb-41");
        student.setIncome(new Date());

        System.out.println(student.getName() + " has a car - " + student.getGroup() + " : " + student.getIncome());
    }
}