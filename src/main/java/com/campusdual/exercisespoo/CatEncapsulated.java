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
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setCastrated(boolean castrated) {
        this.castrated = castrated;
    }

    public String getEyeColour() {
        return eyeColour;
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

    //    Crea un método estático que cambie el color del pelo y otro no estático que cambie el color de los ojos
    public void setChangeColour(String Colour){
        this.colour = Colour;
    }
    public void setChangeEyeColour(String eyeColour){
        this.eyeColour = eyeColour;
    }
    //    Crea un método estático que cambie la edad del gato y otro no estático que permita recuperar ese valor cuando se invoque
    public void setChangeAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("La edad introducida no puede ser 0 o negativa");
        }
    }
    public int getAge(){
        return age;
    }
    //    Crea un método no estático que castre a los gatos y otro no estático, llamado isCastrated, que devuelva su estado
    public void setCastrated(){
        this.castrated = true;
    }
    public void isCastrated(){
        if(this.castrated == true){
            System.out.println("Este gato está castrado.");
        }else{
            System.out.println("Este gato no está castrado.");
        }
    }
    //    Crea un método no estático llamado catDetails() que muestre todas las características de un gato (sé original en la presentación de los datos, dale un poco de arte)
    public void catDetails(){
        System.out.println("Su nombre es: "+this.name+".");
        System.out.println("Su raza es: "+this.breed+".");
        System.out.println("Su sexo es: "+this.sex+".");
        System.out.println("Su edad es: "+this.age+" meses.");
        System.out.println("Su pelo es: "+this.hair+".");
        System.out.println("Es de color: "+this.colour+".");
        isCastrated();
        System.out.println("Sus ojos son de color: "+eyeColour);
        System.out.println(" ");
    }
    //    Crea un main()
//    Crea un gato de la raza siamesa, otro de raza persa, y otro de raza esfinge
    public static void main(String[] args) {
        CatEncapsulated gatoJinx = new CatEncapsulated("Jinx","Siamesa","Hembra",18,"Corto","Gris",false);
        gatoJinx.setCastrated();
        gatoJinx.catDetails();

        CatEncapsulated gatoNoqui = new CatEncapsulated("Noqui","Persa","Macho",4,"Corto","Negro",false);
        gatoNoqui.setCastrated();
        gatoNoqui.catDetails();


        CatEncapsulated gatoClean = new CatEncapsulated("Clean","Esfinge","Macho",13,"Largo","Blanco",false);
        gatoClean.setChangeEyeColour("Blue");
        gatoClean.setChangeAge(-5);
        gatoClean.catDetails();


    }
}