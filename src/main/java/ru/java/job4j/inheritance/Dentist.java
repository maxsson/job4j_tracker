package ru.java.job4j.inheritance;

import java.util.Date;

public class Dentist extends Doctor {
    private int countTeeth = 0;

    public Dentist() {
        super();
    }

    ;

    public void deleteTeeth(Patient patient, int n) {
        patient.setTeeth(patient.getTeeth() - n);
        countTeeth++;
    }


}
