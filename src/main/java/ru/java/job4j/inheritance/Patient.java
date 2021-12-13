package ru.java.job4j.inheritance;

class Patient {
    private String name;
    private String diagnosis;
    private int teeth = 32;

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getName() {
        return name;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setTeeth(int teeth) {
        this.teeth = teeth;
    }

    public int getTeeth() {
        return teeth;
    }
}
