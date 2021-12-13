package ru.java.ru.job4j.inheritance;

import java.util.Date;

public class Doctor extends Profession {

    public Doctor(String name, String surname, String education, Date birthday) {
        super(name, surname, education, birthday);
    }

    public Diagnosis getDiagnosis(Patient patient) {
    patient.diagnosis = "Volchanka";
    Diagnosis diagnosis = new ;
    return new Diagnosis().setNameDiagnosis("fff");


    }
}

class Diagnosis {
    private String nameDiagnosis;

    public void setNameDiagnosis(String nameDiagnosis) {
        this.nameDiagnosis = nameDiagnosis;
    }
}

class Patient {
    String name;
    String diagnosis;
}