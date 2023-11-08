package com.campusdual.exercisespoo;

import java.sql.SQLOutput;

public class CatEncapsulated {
    private String name;
    private String breed;
    private String sex;
    private int age;
    private String hair;
    private String colour;
    private boolean castrated;
    private String eyeColour = "Green";


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        if(age>0) {
            this.age = age;
        }else{
            System.out.println("La edad introducida no puede ser 0 o negativa");
        }
    }
    public int getAge(){
        return age;
    }

    public String getHair() {
        return this.hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public String getColour() {
        return this.colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isCastrated(){
        return this.castrated;
    }
    public void setCastrated(boolean castrated) {
        this.castrated = castrated;
    }

    public String getEyeColour() {
        return this.eyeColour;
    }

    public void setEyeColour(String eyeColour) {
        this.eyeColour = eyeColour;
    }

    public CatEncapsulated(String name, String breed, String sex, int age, String hair, String colour, boolean castrated) {
        this.name = name;
        this.breed = breed;
        this.sex = sex;
        this.age = age;
        this.hair = hair;
        this.colour = colour;
        this.castrated = castrated;
    }
      public void catDetails(){
        System.out.println("Su nombre es: "+this.getName()+".");
        System.out.println("Su raza es: "+this.getBreed()+".");
        System.out.println("Su sexo es: "+this.getSex()+".");
        System.out.println("Su edad es: "+this.getAge()+" meses.");
        System.out.println("Su pelo es: "+this.getHair()+".");
        System.out.println("Es de color: "+this.getColour()+".");
        System.out.println("Está este gato castrado: "+this.isCastrated());
        System.out.println("Sus ojos son de color: "+this.getEyeColour());
        System.out.println(" ");
    }

    public static void main(String[] args) {
        CatEncapsulated gatoJinx = new CatEncapsulated("Jinx","Siamesa","Hembra",18,"Corto","Gris",false);
        gatoJinx.setColour("Marrón");
        gatoJinx.setCastrated(true);
        gatoJinx.catDetails();

        CatEncapsulated gatoNoqui = new CatEncapsulated("Noqui","Persa","Macho",4,"Corto","Negro",false);
        gatoNoqui.setColour("Blanco");
        gatoNoqui.setCastrated(true);
        gatoNoqui.catDetails();


        CatEncapsulated gatoClean = new CatEncapsulated("Clean","Esfinge","Macho",13,"Largo","Blanco",false);
        gatoClean.setEyeColour("Blue");
        gatoClean.setAge(-5);
        gatoClean.catDetails();


    }
}