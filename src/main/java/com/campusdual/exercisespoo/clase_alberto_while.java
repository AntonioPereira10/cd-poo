package com.campusdual.exercisespoo;

import com.campusdual.util.Utils;

import java.util.Scanner;

public class clase_alberto_while {

    public static void main(String[] args) {
        mostrarSaludo();
        pedirNumero();
    }
//while
//       int variableEvaluar = 1;
//       while(variableEvaluar < 5){
//            System.out.println("La variable a evaluar todavía es menor que 5, porque vale " + variableEvaluar);
//            variableEvaluar++;
//        }
//
////do while
//      int variableAEvaluar = 4;
//      do {
//            System.out.println("La variable a evaluar vale " + variableAEvaluar);
//           variableAEvaluar++;
//       } while(variableAEvaluar < 5);

    //pedir al usuario su nombre y mortras por pantalla un mensaje de bienvenida con el

    public static void mostrarSaludo() {
        Scanner scan = new Scanner(System.in);
        String nombreUsuario;

        System.out.println("Introduce tu nombre:");
        nombreUsuario = scan.next();

        System.out.println("Hola " + nombreUsuario + "! ¿Como estas?");
    }

    /*Pedir al usuario un numero mayor que 5 y mostrarlo por pantalla*/
    public static void pedirNumero() {
        Scanner scan = new Scanner(System.in);
        int numeroParaMostrar;
        do {
            System.out.println("Introduce un numero mayor que 5");
            numeroParaMostrar = scan.nextInt();
        } while (numeroParaMostrar < 5);
        System.out.println("El numero que has escrito es: " + numeroParaMostrar);
    }
}
