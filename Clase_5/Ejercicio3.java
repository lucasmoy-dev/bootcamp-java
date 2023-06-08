package Clase_5;

import java.util.Scanner;

/*
* 3) Calculadora de descuento:
Pídele al usuario que ingrese el precio original de un producto.
Pídele al usuario que ingrese el porcentaje de descuento.
Calcula el precio final después de aplicar el descuento utilizando la fórmula: precioFinal = precioOriginal - (precioOriginal * descuento / 100).
Muestra el precio final al usuario.
*/
public class Ejercicio3 {
    static Scanner datosProdcto = new Scanner(System.in);
    public static void main(String[] args) {
        float precio, precioFinal;
        int descuento;
        System.out.println("Calculadora de descuento");
        System.out.print("Ingresa el precio del producto: ");
        precio = datosProdcto.nextFloat();

        System.out.print("Ingresa el porcentaje de descuento: ");
        descuento = datosProdcto.nextInt();

        precioFinal = precio - (precio * descuento/100);

        System.out.println("El precio con descuento es: " + precioFinal);
    }
}

