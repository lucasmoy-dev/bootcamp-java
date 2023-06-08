package Clase_5;

import java.util.Scanner;

/*
* 4) Calculadora de propinas:
Pídele al usuario que ingrese el total de la cuenta en un restaurante.
Pídele al usuario que ingrese el porcentaje de propina que desea dejar.
Calcula el monto de la propina utilizando la fórmula: propina = totalCuenta * (porcentajePropina / 100).
*/
public class Ejercicio4 {
    static Scanner datosConsumo = new Scanner(System.in);
    public static void main(String[] args) {
        float totalCuenta, propina;
        int porcentajePropina;

        System.out.println("Calculadora de propinas");
        System.out.print("Ingrese el total de la cuenta: ");
        totalCuenta = datosConsumo.nextFloat();

        System.out.print("Ingrese el porcentaje de propina: ");
        porcentajePropina = datosConsumo.nextInt();

        propina = totalCuenta * porcentajePropina/100;
        System.out.println("La propina asignada es: " + propina);
    }
}

