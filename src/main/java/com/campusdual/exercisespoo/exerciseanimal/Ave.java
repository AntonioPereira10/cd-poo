package com.campusdual.exercisespoo.exerciseanimal;

public class Ave extends Animal{

    private String habitat;
    private String caracteristicas;

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
    public Ave(int altura, double peso, int edad, String habitat, String caracteristicas){
        super(altura, peso, edad);
        this.habitat = habitat;
        this.caracteristicas =caracteristicas;

    }
}
