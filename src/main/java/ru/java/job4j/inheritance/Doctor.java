package ru.java.job4j.inheritance;

import java.util.Date;

public class Doctor extends Profession {
    public Doctor() {
        super();
    }

    public Doctor(int paciens) {
        super();
        this.paciens = paciens;
    }

    public Doctor(String name, String surname, String education, Date birthday) {
        super(name, surname, education, birthday);
    }

    private int paciens;


    public String getDiagnosis(Patient patient) {
        patient.setDiagnosis("volchanka");
        return "Patcient " + patient.getName() + "bolen " + patient.getDiagnosis();
    }
}

