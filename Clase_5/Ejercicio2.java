package Clase_5;

import java.util.Scanner;

/*
* 2) Conversor de millas a kilómetros:
Pídele al usuario que ingrese una distancia en millas.
Convierte la distancia a kilómetros utilizando la fórmula: kilómetros = millas * 1.60934.
Muestra la distancia en kilómetros al usuario.
*/
public class Ejercicio2 {
    static Scanner datoDistancia = new Scanner(System.in);
    public static void main(String[] args) {
       double millas, kilometros;

       System.out.println("Conversor de millas a kilómetros:");
       System.out.print("Ingrese la cantidad en millas a convertir: ");
       millas = datoDistancia.nextFloat();

       kilometros = millas * 1.60934;
       System.out.println("La distancia equivalente en kilómetros es: " + kilometros);



    }
}
