package ru.java.job4j.inheritance;

public class Surgeon extends Doctor{
    private int countTeeth = 0;
    public Surgeon(){
        super();
    };
    public void insertTeeth(Patient patient, int n) {
        patient.setTeeth(patient.getTeeth() - n);
        countTeeth++;
    }



}
