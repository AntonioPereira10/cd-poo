package com.campusdual.exercisespoo;

public class Exercise02 {

    public static void main(String[] args) {
//        Área de un círculo  = Pi * r * r
//        Longitud de una circunferencia = PI * 2 * r
//        Área de un cuadrado = lado x lado
        double r = 7;
        double pi = Math.PI;
//      double pi = 3.1416
        int l = 6;

        System.out.print("Área del círculo: ");
        System.out.println(Math.PI*r*r); //se debe usar Math.Pi sin establecer una variable
        System.out.print("Longitud de la circunferencia: ");
        System.out.println(pi*2*r);
        System.out.print("Área del cuadrado: ");
        System.out.println(l*l);

    }

}
