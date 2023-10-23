package com.campusdual.exercisespoo;

public class Exercise05 {
    //Comprobar si un número es positivo o negativo. Mayor o menor que 0.
    //Comprobar si un número es múltiplo de otro. Resto de la divsisión es 0.
    //Comprobar si un número es menor a otro. Mayor que el otro.

    public static void main(String[] args) {
        System.out.print("Comprobar si el número es positivo o negativo: ");
        esPositivo(-1);
        System.out.print("Comprobar si un número es múltiplo de otro: ");
        esMultiplo(12,5);
        System.out.print("Comprobar si un número es mayor o menor que otro: ");
        esMayor(5,3);

    }

    public static void esPositivo(double n){
            if (n>=0) {
                System.out.println("Es un número positive");
            }else {
                System.out.println("Es un número negativo");
            }

    }
    public static void esMultiplo(int n, int m){
        if (n % m == 0) {
            System.out.println("Es un múltiplo");
        }else{
            System.out.println("No es múltiplo");
        }
    }

    public static void esMayor(int n, int n2){
        if (n > n2) {
            System.out.println("Es mayor");
        } else if (n < n2) {
            System.out.println("Es menor");
        }else{
            System.out.println("Es igual");
        }
    }

}
