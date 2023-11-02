package com.campusdual.exercisespoo.exerciseanimal;

public class Animal {
    private int altura;
    private double peso;
    private int edad;

    public Animal(int altura, double peso, int edad){
        this.altura = altura;
        this.peso = peso;
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void presentarse(){
        System.out.println();
    }
}
