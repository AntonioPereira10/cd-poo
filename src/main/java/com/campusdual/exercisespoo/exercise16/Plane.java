package com.campusdual.exercisespoo.exercise16;

public class Plane implements IMachine {

    protected String name;

    public Plane(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println("El avión está arrancando");
    }

    @Override
    public void stop() {
        System.out.println("El avión está parado");
    }

    @Override
    public void mantenaince() {
        System.out.println("El avión está en mantenimiento");

    }

    public void takeOff() {
        System.out.println("El avion está despegando");
    }

    public void landOff() {
        System.out.println("El avion está aterrizando");
    }

    public void fly() {
        System.out.println("El avion está volando");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {

        return "El modelo del avion es: " + this.getName();
    }
}