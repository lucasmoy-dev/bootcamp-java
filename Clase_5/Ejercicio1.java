package Clase_5;

import java.util.Scanner;

/*
*1) Calculadora de edad de perros:
Pídele al usuario que ingrese la edad de su perro.
Convierte esa edad a años de perro (se dice que 1 año humano equivale a 7 años de perro).

* */
public class Ejercicio1 {

    static Scanner datoEdad = new Scanner(System.in);
    public static void main(String[] args)
    {
        int edadEquivalente;
        System.out.println("Calculadora de equivalencia entre edad de perros a edad humanan");
        System.out.println("Ingresa la edad de tu perro: ");
        edadEquivalente = datoEdad.nextInt();

        System.out.println("La edad humana equivalente de tu perro es:  " + edadEquivalente*7 + " años");
    }
}