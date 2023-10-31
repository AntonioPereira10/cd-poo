package com.campusdual.exercisespoo;

public class CustomObject {

    public int actualFuel = 10;
    public static String fuelLabel = "Gasolina";

    public int getActualFuel() {
        return this.actualFuel;
    }

    public void setActualFuel(int actualFuel) {
        if (actualFuel >= 0) {
            this.actualFuel = actualFuel;
        } else {
            System.out.println("A capacidade non pode ser negativa.");
        }
    }

    public static String getFuelLabel(){
        return CustomObject.fuelLabel;

    }

    public static void setFuelLabel(String fuelLabel){
        CustomObject.fuelLabel = fuelLabel;
    }

    public void showDetails(){
        System.out.println("O tipo de combustible é: " + CustomObject.getFuelLabel());
    }

    public static void main(String[] args) {
        CustomObject c0 = new CustomObject(); //creamos una instancia de la clase CustomObject
        c0.showDetails(); // accedemos de forma no estática al método del objeto

        CustomObject.setFuelLabel("Diésel"); // accedemos de forma estática al método de la clase

        System.out.println("o tipo de combustible de clase é: " + CustomObject.getFuelLabel());
    }
}
