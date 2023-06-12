package clase_6;

import java.util.Scanner;

public class PiedraPapelTijera {

    public static void main(String[] args) {

         juego();
    }
    static String dato;
    static int contador=0;
    public static void juego() {

      for(int i=0;i<=4;i++) {

          String maquina;

          System.out.println("Ingresa  tu eleccion:  Piedra, Papel, Tijera");

          Scanner scanner = new Scanner(System.in);

          dato = scanner.next();

          int num = (int) Math.floor(Math.random() * 10);

          //Dependiendo del numero aleatorio se le asignara el valor a la variable dato

          if (num == 1 || num == 5 || num == 9) {

              maquina = "piedra";

              comparaPiedra(maquina);

          } else if (num == 2 || num == 6 || num == 10) {

              maquina = "papel";

              comparaPapel(maquina);

          } else if (num == 3 || num == 4 || num == 7 || num == 8) {

              maquina = "tijera";

              comparaTijera(maquina);
          }
            contador++;
      }
    }

    //-----------------------------------------Logica de piedra-----------------------------------------------------------------
    public static void comparaPiedra(String opcion){

        if (opcion.equals("piedra") && dato.equals("piedra")) System.out.println("Has sacado un empate, la maquina saco piedra");

        if (opcion.equals("piedra") && dato.equals("papel")) System.out.println("Has ganado, la maquina saco piedra y el papel arropa la piedra");

        if (opcion.equals("Piedra") && dato.equals("tijera")) System.out.println("Has perdido, la tijera se rompe con la piedra");
    }

    //------------------------------------------Logica de papel-----------------------------------------------------------------
    public static void comparaPapel(String opcion){

        if(opcion.equals("papel") && dato.equals("papel")) System.out.println("Has sacado un empate, la maquina saco papel");

        if(opcion.equals("papel") && dato.equals("piedra")) System.out.println("Has perdido, la maquina saco papel y el papel arropa la piedra");

        if(opcion.equals("papel") && dato.equals("tijera")) System.out.println("Has ganado, la maquina saco papel y la tijera  rompe el papel");
    }

    //------------------------------------------Logica de tijera-----------------------------------------------------------------
    public static void comparaTijera(String opcion){

        if(opcion.equals("tijera") && dato.equals("tijera")) System.out.println("Has sacado un empate, la maquina saco tijera");

        if(opcion.equals("tijera") && dato.equals("piedra")) System.out.println("Has perdido, la maquina saco tijera y la piedra daña la tijera");

        if(opcion.equals("tijera") && dato.equals("papel")) System.out.println("Has perdido, la maquina saco tijera y la tijera  rompe el papel");
    }
}
