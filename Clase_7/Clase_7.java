package Clase_7;

import java.util.Scanner;

public class Clase_7 {

    static Scanner datosNumeros = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arrayNumeros = new int[5];
        int suma = 0;
        int numMayor = 0;
        int numMenor = 100000;
        float promedio = 0;

        for(int i = 0; i < arrayNumeros.length; i++ ){
            System.out.println("Ingresa el número " + (i+1) + ": " );
            arrayNumeros[i] = datosNumeros.nextInt();

            suma +=  arrayNumeros[i];

            if(arrayNumeros[i] > numMayor)
                numMayor = arrayNumeros[i];

            if(arrayNumeros[i] < numMenor)
                numMenor = arrayNumeros[i];
        }//for

        promedio = suma / arrayNumeros.length;


        System.out.print("Los números ingresados son: ");
        for (int i = 0; i < arrayNumeros.length; i++ ){
            System.out.print(arrayNumeros[i] + ",");
        }

        System.out.println("");
        System.out.println("El promedio de los números ingresados es: " + promedio);
        System.out.println("El número mayor es: " + numMayor);
        System.out.println("El número menor es: " + numMenor);


    }//main
}// Clase_7
