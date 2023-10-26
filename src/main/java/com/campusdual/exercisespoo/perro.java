package com.campusdual.exercisespoo;

public class perro {
    int altura;
    boolean esDePeloLargo;
    String raza;
    String nombre;
    String color;

    public perro (int altura, boolean esDePeloLargo, String raza, String nombre, String color){
        this.altura = altura;
        this.esDePeloLargo = esDePeloLargo;
        this.raza = raza;
        this.nombre = nombre;
        this.color = color;

    }

    public void ladrar(){
        System.out.println("Guau! Guau!");
    }
    public void presentarse(){
        this.ladrar();
        System.out.println(this.nombre);
    }

}
