package Clase_6;

import java.util.Random;
import java.util.Scanner;



/* Escribe un programa que permita al usuario jugar el juego clásico de "piedra, papel, tijeras" contra la
computadora. El programa debe solicitar al usuario que ingrese su elección (piedra, papel o tijeras) y
luego generar una elección aleatoria para la computadora. Después de eso, el programa debe determinar el
ganador según las reglas del juego y mostrar el resultado.
 */
public class Piedra_Papel_Tijera_con_while {

    static Scanner opcionUsuario = new Scanner(System.in);
    static Scanner continuaLoop = new Scanner(System.in);
    public static void main(String[] args) {
        int eleccionCPU ;

        String objetoCPU;
        String objetoUser;
        String loopControl = "s";


        System.out.println("------ Juego de piedra papel o tijera ------");
        System.out.println("***********************************");
        System.out.println("\t Para elegir 'piedra' pulsa 1)");
        System.out.println("\t Para elegir 'papel' pulsa 2)");
        System.out.println("\t Para elegir 'tijera' pulsa 3)");
        System.out.println("***********************************");

        while(!((loopControl.equals("salir")) || (loopControl.equals("Salir")) || (loopControl.equals("SALIR")))){

            System.out.print("Ingresa tu elección: ");
            int eleccionUsuario = opcionUsuario.nextInt();

            if (eleccionUsuario == 1)
                objetoUser = "Piedra";
            else if (eleccionUsuario == 2)
                objetoUser = "Papel";
            else
                objetoUser = "Tijera";


            eleccionCPU =  (int)(Math.random()*3)+1;

            if (eleccionCPU == 1)
                objetoCPU = "Piedra";
            else if (eleccionCPU == 2)
                objetoCPU = "Papel";
            else
                objetoCPU = "Tijera";



            if (eleccionUsuario == eleccionCPU){
                System.out.println("Juego empatado, ambos eligieron " + objetoUser);
            }

            else if (eleccionUsuario == 1 && eleccionCPU == 2){
                System.out.println("¡Perdiste!, el " + objetoCPU + " le gana a la " + objetoUser);
            }

            else if (eleccionUsuario == 1 && eleccionCPU == 3) {
                System.out.println("¡Ganaste!, el " + objetoUser + " le gana a la " + objetoCPU);
            }

            else if (eleccionUsuario == 2 && eleccionCPU == 3){
                System.out.println("¡Perdiste!, la " + objetoCPU + " le gana al " + objetoUser);
            }

            else if (eleccionUsuario == 2 && eleccionCPU == 1) {
                System.out.println("¡Ganaste!, el " + objetoUser + " le gana a la " + objetoCPU);
            }

            else if (eleccionUsuario == 3 && eleccionCPU == 1){
                System.out.println("¡Perdiste!, la " + objetoCPU + " le gana a la " + objetoUser);
            }

            else if (eleccionUsuario == 3 && eleccionCPU == 2) {
                System.out.println("¡Ganaste!, la " + objetoUser + " le gana al " + objetoCPU);
            }
            System.out.println("Para salir del juego, escribe salir. Para continuar pulsa cualquier caracter: ");
            loopControl = continuaLoop.nextLine();
        }//while
    }//main
}//class Piedra_Papel_Tijera
