package com.tomek.zadaniadomowe;

public class Engine {

    private final int MAX_RPM = 3000;
    private int currentRpm;

    public int getMAX_RPM() {
        return MAX_RPM;
    }

    public int getCurrentRpm() {
        return currentRpm;
    }

    public void setCurrentRpm(int currentRpm) {
        this.currentRpm = currentRpm;
    }

    public void turnOn() {
        System.out.println("Silnik: uruchamiam");
        this.currentRpm = 1000;
    }

    public void turnOff() {
        System.out.println("Silnik: zatrzymuję");
        this.currentRpm = 0;
    }

    public void increaseSpeed() {
        this.currentRpm += 500;
        System.out.println("Silnik: daję gazu! Aktualne obroty: " + this.currentRpm);

        if (this.currentRpm > this.MAX_RPM)
            System.out.println("Za bardzo gazujesz!! Zaraz wybuchnę!!!");
    }

    public void decreaseSpeed() {
        this.currentRpm -= 500;
        System.out.println("Silnik: odejmuje gazu! Aktualne obroty: " + this.currentRpm);
    }
}
