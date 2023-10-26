package com.campusdual.exercisespoo;

import com.campusdual.util.Utils;

public class Exercise08 {

    public static void main(String[] args) {
        mostrarSaludoConUtils();
        pedirNumeroConUtils();
    }


    public static void  mostrarSaludoConUtils(){
        String nombreUsuario= Utils.string("Introduce tu nombre: ");
        System.out.println("Hola "+nombreUsuario+"! ¿COmo estás?");


    }

    public static void pedirNumeroConUtils(){
        int numeroParaMostrar;
        do {
            numeroParaMostrar= Utils.integer("Introduce un numero mayor que 5: ");
        } while (numeroParaMostrar < 5);
        System.out.println("El numero que has escrito es: " + numeroParaMostrar);
        }
}


