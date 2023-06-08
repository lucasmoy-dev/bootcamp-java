package Clase_5;
import java.util.Random;
import java.util.Scanner;

/*Genera un número aleatorio entre 1 y 100. Pídele al usuario que adivine el número.
 */
public class Ejercicio5 {
    static Scanner datoNumero = new Scanner(System.in);
    public static void main(String[] args) {
        int numUsuario, numAleatorio, n = 99;

        System.out.println("Generador de números aleatorios de 1 a 100");
        System.out.print("Adivina el número entre 1 y 100 que va a generar la computadora: ");
        numUsuario = datoNumero.nextInt();
        numAleatorio = new Random().nextInt(n + 1);
        System.out.println("El número generado es: " + numAleatorio);
    }
}
