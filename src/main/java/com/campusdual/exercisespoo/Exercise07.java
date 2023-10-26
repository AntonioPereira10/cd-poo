package com.campusdual.exercisespoo;

/*Sintaxis de for
 * El bucle for consta de 3 partes:
 * Una expresión de inicialización (se ejecuta al principio, asignando a la variable de control un valor inicial)
 * Una expresión de condición que hará que el bucle se mantenga mientras que se cumpla
 * Una expresión de incremento/decremento sobre la variable de control para conseguir la finalización del bucle
 * El código que se repetirá en cada iteración será el que vaya entre llaves*/

public class Exercise07 {
    //Mostrar los primeros 15 números naturales
    //Sumar los 100 números naturales


    public static void printNNumbers(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println();
    }

    public static int sumNumbers(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        printNNumbers(3);
        printNNumbers(14);
        printNNumbers(30);
        printNNumbers(7);

        System.out.println(sumNumbers(100));
        System.out.println(sumNumbers(10));
        System.out.println(sumNumbers(5));

        mostrar30Numeros();
        System.out.println("La suma de los 100 primeros números naturales es: " + suma100NumerosNat(100));
        calcularCuadrados();
    }

    // MOSTRAR POR PANTALLA LOS 30 PRIMEROS NÚMEROS PARES PERO USANDO EL FOR

    public static void mostrar30Numeros() {
        for (int i = 2; i <= 60; i += 2) { //i+=2 --> i = i + 2
            System.out.print((i) + " ");

        }
    }

    // SUMAR LOS 100 NÚMEROS NATURALES

    public static int suma100NumerosNat(int num) {
        int sumaTotal = 0;
        for (int i = 1; i <= 100; i++) {
            sumaTotal = sumaTotal + i; //tambien funcionaria con sumaTotal += i
        }
        System.out.println();
        return sumaTotal;
    }

    //CALCULAR EL CUADRADO DE LOS 20 PRIMEROS NUMEROS NATURALES

    public static void calcularCuadrados() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("El cuadrado de " + i + " es " + i*i);
        }
    }
    /*Construye un método que, recibiendo por parámetro una letra del abecedario muestre por pantalla cuántas letras
     * le faltan hasta llegar a la Z (sin contar la Ñ)*/
    public static void contarLetras(char letra) {
        int contador = 0;
        for(char i = letra; i < 'Z'; i++) {
            contador++;
        }
        System.out.println("La cantidad de letras del abecedario que hay entre la " + letra + " y la Z, es: " + contador);
    }
    public static void contarLetras2(char letra) {
        int valorDeLetra = 'Z' - letra;
        System.out.println("La cantidad de letras del abecedario que hay entre la "
                + letra + " y la Z, es: " + valorDeLetra);
    }

}

//    //Sumar los primeros 100 números naturales
//    public static void sumNumbers(int num) {
//        int sumaTotal = 0;
//        for (int i = 1; i <= num; i++) {
//            sumaTotal = sumaTotal + i; //tambien funcionaria con sumaTotal += i
//        }
//        System.out.println("La suma de los 100 primeros números naturales es " + sumaTotal);
//    }