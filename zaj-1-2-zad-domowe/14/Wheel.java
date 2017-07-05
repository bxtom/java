package com.tomek.zadaniadomowe;

public class Wheel {
    private String position;
    private boolean front;
    private int diameter;

    public Wheel(String position, boolean front, int diameter) {
        this.position = position;
        this.front = front;
        this.diameter = diameter;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isFront() {
        return front;
    }

    public void setFront(boolean front) {
        this.front = front;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public String getFronRearDescription() {
        if (this.isFront())
            return "przednie";
        else
            return "tylne";
    }

    public void spinForward() {
        System.out.println(this.getPosition() + " " + this.getFronRearDescription() + " koło: kręcę do przodu! ");
    }

    public void spinBackward() {
        System.out.println(this.getPosition() + " " + this.getFronRearDescription() + " koło: kręcę do tylu! ");
    }

    public void turn(String direction) {
        System.out.println(this.position + " " + this.getFronRearDescription() +
                " koło: skręcam w " + direction);
    }
}
