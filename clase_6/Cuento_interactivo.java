package clase_6;

import java.util.Scanner;

public class Cuento_interactivo {
    static String cuento = "Llegas en momento de tu vida donde tienes que elegir la vida que vas a tomar y ya tus padres" +
                           " ya te señalaron los distintos caminos:";


    public static void main(String[] args) {

        System.out.println(cuento);

        System.out.println("Escoge el numero de tu camino: " + "\n1) Estudias " + "\n2) Entras a la delincuencia");

        Scanner sc = new Scanner(System.in);

        String camino = sc.next();

        if (camino.equals("1")) {

            System.out.println("Te graduas de programador y encuentras el trabajo que te da la vida que siempre has querido");

        } else if (camino.equals("2")) {

            System.out.println("Terminas en prision o en un cementerio dejando a tu paso sufrimiento a tus familiares");
        }

        promedio(10, 15, 12);

        numeros();
    }

    //----------------------------------------Hallar el Promedio--------------------------------------------------------------

    public static void promedio(int a, int b, int c) {

        System.out.println("El promedio es: " + (a + b + c / 3));

    }

    //----------------------------------------Numeros del 1 al 100------------------------------------------------------------

       static int contador=0;
       public static void numeros(){

          for(int i=0; i<=100;i++){

              System.out.println("Numero: " + contador);

              contador++;
          }
      }
}
