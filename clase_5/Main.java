import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cargaDeDatos = new Scanner(System.in);

        // Peso en KG / altura en metros al cuadrado
        System.out.println("Ingrese su peso en KG");
        double peso = cargaDeDatos.nextDouble();
        System.out.println("Ingrese su altura en metros");
        double altura = cargaDeDatos.nextDouble();
        double indiceMasaCorporal = peso / (altura * altura);
        System.out.println("Tu indice de masa corporal es: " + indiceMasaCorporal);

        // Mayor a 30 -> Obesidad
        if (indiceMasaCorporal >= 30) {
            System.out.println("Estás en estado de obesidad.");
        }
        // Entre 25 y 30 sobrepeso
        if (indiceMasaCorporal >= 25 && indiceMasaCorporal < 30) {
            System.out.println("Estás en estado de sobrepeso.");
        }
        // Entre 18.5 y 25 normal
        if (indiceMasaCorporal >= 18.5 && indiceMasaCorporal < 25) {
            System.out.println("Estás en un peso normal.");
        }
        // Menor a 18.6 debajo del normal
        if (indiceMasaCorporal < 18.6) {
            System.out.println("Estás en un peso menor al normal.");
        }

        /*
        System.out.println("¿Qué edad tienes?");
        Scanner cargaDeDatos = new Scanner(System.in);
        Integer edad = cargaDeDatos.nextInt();

       if (edad >= 18) {
           System.out.println("Es mayor de edad");
       } else {
           System.out.println("Es menor de edad");
       }
       */
    }
}
