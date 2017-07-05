package com.tomek.zadaniadomowe;

public class Car {
    private String modelName;
    private Wheel[] wheels = new Wheel[4];
    private Engine engine;

    public Car(String modelName) {
        this.modelName = modelName;
        this.engine = new Engine();

        wheels[0] = new Wheel("lewe", true, 45);
        wheels[1] = new Wheel("prawe", true, 45);
        wheels[2] = new Wheel("lewe", false, 45);
        wheels[3] = new Wheel("prawe", false, 45);
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    private double calculateSpeed(int rpm, int wheelDiameter) {
        return 2 * Math.PI * 100 * wheelDiameter * (rpm / 5000.0);
    }

    public void start() {
        System.out.println("Samochód " + this.getModelName() + ": uruchamiam");
        this.getEngine().turnOn();
    }

    public void stop() {
        System.out.println("Samochód " + this.getModelName() + ": zatrzymuję");
        this.getEngine().turnOff();
    }

    public void driveForward() {
        System.out.println("Samochód " + this.getModelName() + ": jadę do przodu");
        this.getEngine().increaseSpeed();

        for (Wheel wheel : this.getWheels()) {
            wheel.spinForward();
        }

        double speed = this.calculateSpeed(this.getEngine().getCurrentRpm(), this.getWheels()[0].getDiameter());
        System.out.format("Aktualna predkosc: %.0f \n", speed);
    }

    public void driveBackward() {
        System.out.println("Samochód " + this.getModelName() + ": jadę do tylu");
        this.getEngine().increaseSpeed();

        for (Wheel wheel : wheels) {
            wheel.spinBackward();
        }

        double speed = this.calculateSpeed(this.getEngine().getCurrentRpm(), this.getWheels()[0].getDiameter());
        System.out.format("Aktualna predkosc: %.0f\n", speed);
    }

    public  void turn(String direction) {
        for (Wheel wheel : wheels) {
            if (wheel.isFront())
                wheel.turn(direction);
        }
    }
}
