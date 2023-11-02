package com.campusdual.exercisespoo.exerciseanimal;

public class Caballo extends Mamifero{
    private String nombreCientifico;
    private String nombreAnimal;
    private String territorio;
    private String sonidoAnimal;

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

    public String getTerritorio() {
        return territorio;
    }

    public void setTerritorio(String territorio) {
        this.territorio = territorio;
    }

    public String getSonidoAnimal() {
        return sonidoAnimal;
    }

    public void setSonidoAnimal(String sonidoAnimal) {
        this.sonidoAnimal = sonidoAnimal;
    }

    public Caballo(int altura, double peso, int edad, String habitat, String caracteristicas, String nombreCientifico,
                 String nombreAnimal, String territorio, String sonidoAnimal) {
        super(altura, peso, edad, habitat, caracteristicas);
        this.nombreCientifico = nombreCientifico;
        this.nombreAnimal = nombreAnimal;
        this.territorio = territorio;
        this.sonidoAnimal = sonidoAnimal;
    }

    @Override
    public void presentarse() {
        System.out.println(this.getSonidoAnimal() + " " + this.getNombreAnimal() + "!" );
    }
}