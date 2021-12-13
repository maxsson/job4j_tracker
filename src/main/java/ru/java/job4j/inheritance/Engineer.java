package ru.java.job4j.inheritance;

import java.util.Date;

public class Engineer extends Profession{

    public Engineer(String name, String surname, String education, Date birthday) {
        super(name, surname, education, birthday);
    }

    public void setProjectsNow(int projectsNow) {
        this.projectsNow = projectsNow;
    }

    private int projectsNow;
    private int projectsInPast;

    public int getProjectsNow() {
        return projectsNow;
    }

    public int countProjects() {
        return projectsNow + projectsInPast;
    }
}
